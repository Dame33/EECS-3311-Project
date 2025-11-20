package org.openjfx.EECS_3311_Project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

import org.openjfx.EECS_3311_Project.managers.SceneManager;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        //initialize the databases
        DatabaseUtils.initializeDBFolder();

        //setting the first page we want the user to see
        scene = new Scene(loadFXML("SignIn"), 640, 480);
        stage.setScene(scene);
        Image icon = new Image(SceneManager.class.getResourceAsStream("/images/logo.png"));
        stage.getIcons().add(icon);
        stage.show();
        

    }


    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/fxml/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}