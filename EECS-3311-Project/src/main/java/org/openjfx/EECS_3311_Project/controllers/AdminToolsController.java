package org.openjfx.EECS_3311_Project.controllers;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.util.Callback;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.model.Room;

public class AdminToolsController {

    @FXML private TableView<Room> roomsTable;
    @FXML private TableColumn<Room, String> colRoomName;
    @FXML private TableColumn<Room, String> colBuildingName;
    @FXML private TableColumn<Room, Integer> colCapacity;
    @FXML private TableColumn<Room, Boolean> colActive;
    @FXML private TableColumn<Room, Void> colEdit;
    @FXML private TableColumn<Room, Void> colDelete;

    private final ObservableList<Room> rooms = FXCollections.observableArrayList();
    Mediator mediator = Mediator.getInstance();
    @FXML
    public void initialize() {
        setupColumns();
        loadRooms();
    }

    private void setupColumns() {
        colRoomName.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getRoomName()));
        colRoomName.setCellFactory(TextFieldTableCell.forTableColumn());
        colRoomName.setEditable(false);

        colBuildingName.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getBuildingName()));
        colBuildingName.setCellFactory(TextFieldTableCell.forTableColumn());
        colBuildingName.setEditable(false);

        colCapacity.setCellValueFactory(cell -> new SimpleIntegerProperty(cell.getValue().getCapacity()).asObject());
        colCapacity.setCellFactory(TextFieldTableCell.forTableColumn(new javafx.util.converter.IntegerStringConverter()));
        colCapacity.setEditable(false);

        colActive.setCellValueFactory(cell -> new SimpleBooleanProperty(cell.getValue().isActive()));
        colActive.setCellFactory(CheckBoxTableCell.forTableColumn(colActive));

        colEdit.setCellFactory(createEditCellFactory());

        colDelete.setCellFactory(createButtonCellFactory("Delete", room -> rooms.remove(room)));

        roomsTable.setItems(rooms);
        roomsTable.setEditable(true);
    }

    private void loadRooms() {
    	
    	rooms.addAll(mediator.getAllRooms());
    	
    }

    @FXML
    private void handleAddRoom() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Add Room button clicked!");
        alert.showAndWait();
    }


    private Callback<TableColumn<Room, Void>, TableCell<Room, Void>> createButtonCellFactory(String label, java.util.function.Consumer<Room> action) {
        return col -> new TableCell<>() {
            private final Button button = new Button(label);

            {
                button.setOnAction(e -> {
                    Room room = getTableView().getItems().get(getIndex());
                    action.accept(room);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) setGraphic(null);
                else setGraphic(button);
            }
        };
    }

    private Callback<TableColumn<Room, Void>, TableCell<Room, Void>> createEditCellFactory() {
        return col -> new TableCell<>() {
            private final Button editButton = new Button("Edit");
            private final Button saveButton = new Button("✔");
            private final Button cancelButton = new Button("✖");
            private final HBox actionButtons = new HBox(5, saveButton, cancelButton);

            private String originalRoomName;
            private String originalBuildingName;
            private int originalCapacity;

            {
                editButton.setOnAction(e -> {
                    Room room = getTableView().getItems().get(getIndex());

                    originalRoomName = room.getRoomName();
                    originalBuildingName = room.getBuildingName();
                    originalCapacity = room.getCapacity();

                    colRoomName.setEditable(true);
                    colBuildingName.setEditable(true);
                    colCapacity.setEditable(true);

                    roomsTable.edit(getIndex(), colRoomName); 
                    setGraphic(actionButtons);
                });

                saveButton.setOnAction(e -> {
                    disableEditing();
                });

                cancelButton.setOnAction(e -> {
                    Room room = getTableView().getItems().get(getIndex());
                    room.setRoomName(originalRoomName);
                    room.setBuildingName(originalBuildingName);
                    room.setCapacity(originalCapacity);

                    roomsTable.refresh();
                    disableEditing();
                });
            }

            private void disableEditing() {
                colRoomName.setEditable(false);
                colBuildingName.setEditable(false);
                colCapacity.setEditable(false);
                setGraphic(editButton);
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
//                super.updateItem(item, empty);
//                if (empty) setGraphic(null);
//                else setGraphic(editButton);
            	// make a call here to actually save the edits
            }
        };
    }
}
