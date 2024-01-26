module javafxmain {
    requires javafx.controls;
    requires javafx.fxml;

    opens javafxmain to javafx.fxml;
    exports javafxmain;
}
