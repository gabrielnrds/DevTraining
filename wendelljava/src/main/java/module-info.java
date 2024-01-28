module javawendell {
    requires javafx.controls;
    requires javafx.fxml;

    opens javawendell to javafx.fxml;
    exports javawendell;
}
