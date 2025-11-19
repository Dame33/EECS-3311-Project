package org.openjfx.EECS_3311_Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.UUID;

import org.openjfx.EECS_3311_Project.controllers.HomePageController;

public class DatabaseUtils {


	private static final Path dataFolderDirectory = Paths.get(System.getProperty("user.dir"), "databases"); // updated so that data is saved relative to project directory

	public static final Path userFilePath = dataFolderDirectory.resolve("Users.csv");
	public static final Path bookingFilePath = dataFolderDirectory.resolve("Bookings.csv");
	public static final Path roomsFilePath = dataFolderDirectory.resolve("Rooms.csv");
	public static final Path accountRolesFilePath = dataFolderDirectory.resolve("AccountRoles.csv");
	public static final Path paymentsFilePath = dataFolderDirectory.resolve("Payments.csv");
    

    //scene changer
    // there shouldnt be a scene changer in this repo util. moved to static scenemanager class


    private static String getResourcePath(String resourceName) {
        try {
            // This searches the classpath for the file
            URL resourceUrl = DatabaseUtils.class.getResource(resourceName);

            if (resourceUrl == null) {
                throw new RuntimeException("Cannot find resource: " + resourceName);
            }

            // Convert the URL to a clean file path
            return Paths.get(resourceUrl.toURI()).toString();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error loading resource: " + resourceName, e);
        }
    }

    public static void initializeDBFolder() {
        try {
            if (!Files.exists(dataFolderDirectory)) {
                Files.createDirectories(dataFolderDirectory);
            }

            // List of all CSV files to ensure exist
            String[] csvFiles = {
                "Bookings.csv",
                "Rooms.csv",
                "Users.csv",
                "AccountRoles.csv",
                "Payments.csv"
            };

            // create empty file if it doesnt exist
            for (String csv : csvFiles) {
                Path filePath = dataFolderDirectory.resolve(csv);
                if (!Files.exists(filePath)) {
                    Files.createFile(filePath);
                    System.out.println("Created empty CSV: " + filePath);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException("Could not initialize database folder or CSV files", e);
        }
    }
//
//    private static void loadCSV(String resourceName, Path destination) throws IOException {
//        try (InputStream inputStream = DatabaseUtils.class.getResourceAsStream("/" + resourceName)) {
//            if (inputStream == null) {
//                throw new IOException("Could not find CSV file: " + resourceName);
//            }
//            try (OutputStream outputStream = Files.newOutputStream(destination)) {
//                inputStream.transferTo(outputStream);
//            }
//        }
//    }


}
