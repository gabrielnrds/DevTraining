module javawendell {
    requires javafx.controls;
    requires javafx.fxml;

    opens javaFX1 to javafx.fxml;
    exports javaFX1;
}
