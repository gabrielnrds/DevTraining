package main.java.javaFX1;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

public class SecondaryController {

    @FXML
    private Button BtnVoltarTela;
    @FXML
    private Button BtnRegistro;

    @FXML
    void VoltarTela(ActionEvent event) throws IOException {
        App.trocartela(new FXMLLoader(App.class.getResource("telainicial.fxml")).load());
    }

}
