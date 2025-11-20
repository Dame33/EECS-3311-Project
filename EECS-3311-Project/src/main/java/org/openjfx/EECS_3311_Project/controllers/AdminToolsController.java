package org.openjfx.EECS_3311_Project.controllers;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
        // room name
        colRoomName.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getRoomName()));
        colRoomName.setCellFactory(TextFieldTableCell.forTableColumn());
        colRoomName.setEditable(false);
        colRoomName.setOnEditCommit(event -> {
            Room room = event.getRowValue();
            room.setRoomName(event.getNewValue());
        });

        // building name
        colBuildingName.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getBuildingName()));
        colBuildingName.setCellFactory(TextFieldTableCell.forTableColumn());
        colBuildingName.setEditable(false);
        colBuildingName.setOnEditCommit(event -> {
            Room room = event.getRowValue();
            room.setBuildingName(event.getNewValue());
        });
        // capacuty
        colCapacity.setCellValueFactory(cell -> new SimpleIntegerProperty(cell.getValue().getCapacity()).asObject());
        colCapacity.setCellFactory(TextFieldTableCell.forTableColumn(new javafx.util.converter.IntegerStringConverter()));
        colCapacity.setEditable(false);
        colCapacity.setOnEditCommit(event -> {
            Room room = event.getRowValue();
            room.setCapacity(event.getNewValue());
        });

        // is  active
        colActive.setCellValueFactory(cell -> new SimpleBooleanProperty(cell.getValue().isActive()));
        colActive.setCellFactory(createActiveCellFactory());

        // edit and deletebuttons
        colEdit.setCellFactory(createEditCellFactory());
        colDelete.setCellFactory(createDeleteCellFactory());

        roomsTable.setItems(rooms);
        roomsTable.setEditable(true);
    }

    private void loadRooms() {
    	
    	rooms.addAll(mediator.getAllRooms());
    	
    }

    @FXML
    private void handleAddRoom() {
        
        Dialog<Void> dialog = new Dialog<>();
        dialog.setTitle("Add New Room");

       
        ButtonType addButtonType = new ButtonType("Add Room", ButtonBar.ButtonData.OK_DONE);
        ButtonType cancelButtonType = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
        dialog.getDialogPane().getButtonTypes().addAll(addButtonType, cancelButtonType);

        
        TextField tfRoomName = new TextField();
        tfRoomName.setPromptText("Room Name");

        TextField tfBuildingName = new TextField();
        tfBuildingName.setPromptText("Building Name");

        TextField tfCapacity = new TextField();
        tfCapacity.setPromptText("Capacity");

        
        VBox content = new VBox(10);
        content.getChildren().addAll(
                new Label("Room Name:"), tfRoomName,
                new Label("Building Name:"), tfBuildingName,
                new Label("Capacity:"), tfCapacity
        );
        dialog.getDialogPane().setContent(content);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == addButtonType) {
                try {
                    String roomName = tfRoomName.getText().trim();
                    String buildingName = tfBuildingName.getText().trim();
                    int capacity = Integer.parseInt(tfCapacity.getText().trim());

                    if (roomName.isEmpty() || buildingName.isEmpty()) {
                        throw new IllegalArgumentException("Please fill out all fields!");
                    }
                    
                    Room room = new Room(buildingName, roomName, capacity, true);

                    
                    mediator.upsertRoom(room);
                    rooms.add(room);

                    Alert success = new Alert(Alert.AlertType.INFORMATION, "Room added successfully!");
                    success.initOwner(roomsTable.getScene().getWindow());
                    success.showAndWait();

                } catch (NumberFormatException e) {
                    Alert error = new Alert(Alert.AlertType.ERROR, "Capacity must be a number!");
                    error.initOwner(roomsTable.getScene().getWindow());
                    error.showAndWait();
                } catch (IllegalArgumentException e) {
                	Alert error = new Alert(Alert.AlertType.ERROR, e.getMessage());
                    error.initOwner(roomsTable.getScene().getWindow());
                    error.showAndWait();
                }
            }
            return null;
        });
        dialog.initOwner(roomsTable.getScene().getWindow());
        dialog.showAndWait();
    }
    
    private Callback<TableColumn<Room, Boolean>, TableCell<Room, Boolean>> createActiveCellFactory() {
        return column -> new TableCell<Room, Boolean>() {
            private final CheckBox checkBox = new CheckBox();

            {
                checkBox.setOnAction(e -> {
                    Room room = getTableView().getItems().get(getIndex());
                    boolean newValue = checkBox.isSelected();

                    // update the model
                    room.setActive(newValue);

                    // call a function whenever the checkbox is toggled
                    mediator.upsertRoom(room);
                });
            }

            @Override
            protected void updateItem(Boolean item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    checkBox.setSelected(item != null && item);
                    setGraphic(checkBox);
                }
            }
        };
    }


    private Callback<TableColumn<Room, Void>, TableCell<Room, Void>> createDeleteCellFactory() {
        return col -> new TableCell<>() {
            private final Button deleteButton = new Button("🗑");
            

            {
            	deleteButton.getStyleClass().add("button-no-bg");
                deleteButton.setOnAction(e -> {
                    Room room = getTableView().getItems().get(getIndex());

                    // ask user to confirm with this alert
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Delete Room");
                    alert.setHeaderText(null);
                    alert.setContentText("Are you sure you want to delete this room?");
                    
                    alert.initOwner(roomsTable.getScene().getWindow());

                    alert.showAndWait().ifPresent(response -> {
                        if (response == ButtonType.OK) {
                            // delete the room only if user clicked ok
                            mediator.removeRoom(room);
                            getTableView().getItems().remove(room);
                        }
                    });
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(deleteButton);
                }
            }
        };
    }
    private Callback<TableColumn<Room, Void>, TableCell<Room, Void>> createEditCellFactory() {
        return col -> new TableCell<>() {
            private final Button editButton = new Button("🖉");
            private final Button saveButton = new Button("✔");
            private final Button cancelButton = new Button("✖");
            private final HBox actionButtons = new HBox(5, saveButton, cancelButton);

            private String originalRoomName;
            private String originalBuildingName;
            private int originalCapacity;

            {
            	
            	editButton.getStyleClass().add("button-no-bg");
            	saveButton.getStyleClass().add("button-no-bg");
            	cancelButton.getStyleClass().add("button-no-bg");
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
                   
                    Room room = getTableView().getItems().get(getIndex());
                   
                    // save to csv
                    System.out.println(room.getRoomName());
                    mediator.upsertRoom(room);
                    updateItem(getItem(),false);
                });

                cancelButton.setOnAction(e -> {
                    Room room = getTableView().getItems().get(getIndex());
                    room.setRoomName(originalRoomName);
                    room.setBuildingName(originalBuildingName);
                    room.setCapacity(originalCapacity);
                    
                    roomsTable.refresh();

                    updateItem(getItem(), false);
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
                super.updateItem(item, empty);
                if (empty) setGraphic(null);
                else setGraphic(editButton);
            }
        };
    }
}
