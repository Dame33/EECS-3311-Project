package org.openjfx.EECS_3311_Project.csv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import org.openjfx.EECS_3311_Project.model.ICSVDataObject;

public abstract class CSVOperations<T extends ICSVDataObject> {

    // create object
    public T create(T item) {
        List<T> all = readAll();
        all.add(item);
        writeAll(all);
        
        return item;
    }

    // read many by a filter
    public List<T> readMany(BiPredicate<T, String[]> filter) {
        List<T> all = readAll();
        return all.stream()
                .filter(item -> filter.test(item, toColumns(item)))
                .collect(Collectors.toList());
    }

    // read first object matching row
    public Optional<T> readOne(BiPredicate<T, String[]> match) {
        List<T> all = readAll();
        for (T item : all) {
            String[] cols = toColumns(item);
            if (match.test(item, cols)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }
    
    // read first object matching row (by id)
    public Optional<T> readById(String id) {
        List<T> all = readAll();

        for (T item : all) {
            if (item.getId().equals(id)) {
                return Optional.of(item);
            }
        }

        return Optional.empty();
    }
    
    public T upsert(T item) {
        List<T> all = readAll();
        boolean updated = false;

        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getId().equals(item.getId())) {
                all.set(i, item); // update existing
                updated = true;
                break;
            }
        }

        if (!updated) {
            all.add(item); // create new
        }
        
        writeAll(all);
        return item;
    }

    // replace object by id
    public T update(T newItem) {
        List<T> all = readAll();

        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getId().equals(newItem.getId())) {
                all.set(i, newItem);
                break;
            }
        }

        writeAll(all);
        return newItem;
    }

    // remove objects by id
    public void delete(T itemToDelete) {
        List<T> all = readAll();
        all.removeIf(item -> item.getId().equals(itemToDelete.getId()));
        writeAll(all);
    }

    // read all objects from csv
    public List<T> readAll() {
        try {
            if (!Files.exists(getCSVPath())) return new ArrayList<>();
            List<String> lines = Files.readAllLines(getCSVPath());
            return parseLines(lines);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // write all objects to csv
    public List<T> writeAll(List<T> items) {
        try {
            List<String> lines = convertToLines(items);
            Files.write(getCSVPath(), lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }

    // convert objects to csv lines
    protected List<String> convertToLines(List<T> items) {
        List<String> rows = new ArrayList<>();
        for (T item : items) {
            rows.add(item.toCSVRow());
        }
        return rows;
    }

    // safe string helper
    protected String safe(String s) {
        return s == null ? "" : s;
    }

    // TO OVERRIDE WITH SUBCLASSES

    protected abstract Path getCSVPath();

    // convert object to csv columns
    protected abstract String[] toColumns(T item);

    // convert csv lines to objects
    protected abstract List<T> parseLines(List<String> lines);
}
