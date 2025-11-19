module org.openjfx.EECS_3311_Project {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;

	opens org.openjfx.EECS_3311_Project to javafx.fxml;
	opens org.openjfx.EECS_3311_Project.controllers to javafx.fxml; // updated for controllers package
    
    exports org.openjfx.EECS_3311_Project;
    exports org.openjfx.EECS_3311_Project.controllers;
}
