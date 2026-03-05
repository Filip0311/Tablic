module se.filip.tablic {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens se.filip.tablic to javafx.fxml;
    exports se.filip.tablic;
}