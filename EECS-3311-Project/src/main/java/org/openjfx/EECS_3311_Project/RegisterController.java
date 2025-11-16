package org.openjfx.EECS_3311_Project;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.skin.ComboBoxListViewSkin;
import javafx.scene.layout.AnchorPane;

public class RegisterController implements Initializable {

	@FXML
	private ComboBox<String> comboBox;
	@FXML
	private AnchorPane anchorPane_registerPage;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		//fixing fullscreen scaling issues
		anchorPane_registerPage.sceneProperty().addListener((obs, oldScene, newScene) -> {
			if (newScene != null) {

				newScene.widthProperty().addListener((observable, oldWidth, newWidth) -> {
					double width = newWidth.doubleValue();

					// if the width of the window is greater than 1200px, zoom by 25%
					if (width > 1200) {
						anchorPane_registerPage.setScaleX(1.25); // 125% size
						anchorPane_registerPage.setScaleY(1.25);
					} else {
						// Otherwise, go back to normal size
						anchorPane_registerPage.setScaleX(1.0);
						anchorPane_registerPage.setScaleY(1.0);
					}
				});
			}
		});

		//scaling the comboBox
		comboBox.setOnShowing(event -> {
			ComboBoxListViewSkin<?> skin = (ComboBoxListViewSkin<?>) comboBox.getSkin();

			if (skin != null) {
				Node popupContent = skin.getPopupContent();

				double currentScale = anchorPane_registerPage.getScaleX();
				double newFontSize = 12 * currentScale;


				popupContent.setStyle("-fx-font-size: " + newFontSize + "px;");
			}
		});


		comboBox.getItems().addAll("Student", "Faculty", "Staff", "Partner");

	}


	@FXML
	public String getComboBoxInput(ActionEvent event) {
		return comboBox.getValue();
	}

}