package org.openjfx.EECS_3311_Project.controllers;

import java.util.ArrayList;
import java.util.List;

import org.openjfx.EECS_3311_Project.Mediator;
import org.openjfx.EECS_3311_Project.model.User;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
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

		        // retrieve all users
		        List<User> users = Mediator.getInstance().getAllUsers();

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

		TextField emailField = new TextField(user.getEmail());
		emailField.setEditable(false);
		emailField.setPrefWidth(250);

		boolean isAdmin = user.getUserType().equalsIgnoreCase("Admin");

		CheckBox adminCheck = new CheckBox("Admin?");
		adminCheck.setSelected(isAdmin);

		adminCheck.setOnAction(e -> {
			boolean newValue = adminCheck.isSelected();

			Mediator.getInstance().toggleAdmin(user, newValue);
			user.setUserType(newValue ? "Admin" : "User");
		});

		row.getChildren().addAll(emailField, adminCheck);
		return row;
	}

	@FXML
	public void getRolesEditorPage() {
		// coming later
	}
}

