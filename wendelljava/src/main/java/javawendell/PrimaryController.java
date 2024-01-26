package javawendell;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button BtnLogin;

    @FXML
    private TextField Texto1;

    @FXML
    void EntrarSegundaTela(ActionEvent event) {
        try {
            App.trocartela(new FXMLLoader(App.class.getResource("segundatela.fxml")).load());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
