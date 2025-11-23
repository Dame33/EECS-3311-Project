package org.openjfx.EECS_3311_Project.controllers;

import java.util.List;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.model.User;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class CECController {

    @FXML
    private StackPane contentArea;

    @FXML
    private VBox adminsList;

    @FXML
    public void getAdminsEditorPage() {
        try {
            FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/fxml/cectools/cec_admins.fxml")
            );

            Node adminPage = loader.load();
            AdminsPageController controller = loader.getController();

            contentArea.getChildren().setAll(adminPage);

         
            List<User> users = Mediator.getInstance()
                    .getAllUsers()
                    .stream()
                    .filter(u -> !u.getUserType().equalsIgnoreCase("CEC"))
                    .toList();
            

            for (User u : users) {
                HBox row = createAdminRow(u);
                controller.adminsList.getChildren().add(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private HBox createAdminRow(User user) {

        HBox row = new HBox(20);
        row.setStyle("-fx-padding: 5; -fx-alignment: center-left;");

        Label emailLabel = new Label(user.getEmail());
        emailLabel.setPrefWidth(250);

        boolean isAdmin = user.getUserType().equalsIgnoreCase("Admin");

        CheckBox adminCheck = new CheckBox("Admin?");
        adminCheck.setSelected(isAdmin);

        adminCheck.setOnAction(e -> {
            boolean newValue = adminCheck.isSelected();

            Mediator.getInstance().getUserManager().toggleAdmin(user.getId(), newValue);
            user.setUserType(newValue ? "Admin" : "User");
        });

        row.getChildren().addAll(emailLabel, adminCheck);
        return row;
    }

    @FXML
    public void getRolesEditorPage() {
        try {
            FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/fxml/cectools/cec_roles.fxml")
            );

            Node page = loader.load();
            contentArea.getChildren().setAll(page);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    public void initialize() {
        getAdminsEditorPage();
    }
}
