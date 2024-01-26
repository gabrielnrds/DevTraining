package javawendell;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import primeiracamada.controle.Login;
import primeiracamada.dados.RepositorioClientes;
import primeiracamada.entidades.Cliente;
import primeiracamada.entidades.Professor;

public class PrimaryController implements Initializable {

    @FXML
    private Button BtnLogin;

    @FXML
    private TextField Texto1;

    @FXML
    private TextField TextoSenha;

    @FXML
    void EntrarSegundaTela(ActionEvent event) {
        try {
            RepositorioClientes clientes = new RepositorioClientes(1000);
            Professor professor1 = new Professor("Wendell", "874243252",
                    "wendell.stronda@email.com", "515141414", 21, 78, "manhã", 98);
            Cliente cliente = new Cliente("seabra", "423423456",
                    "cliente@email.com", "898444111-89", 32, "Rua robertinho",
                    "treino", null, professor1, false);
            clientes.cadastrar(cliente);
            Login login1 = new Login(cliente.getNome(), "123");
            String login = Texto1.getText();// vou pegar informação q usuario digitar no txtfield
            String senha = TextoSenha.getText();// pega texto da senha0
            if (login.equals(login1.getUsuario())&& senha.equals(login1.getSenha())) {
                App.trocartela(new FXMLLoader(App.class.getResource("segundatela.fxml")).load());
            } else {
                exibirAlertaMensagem("ERRO", "Senha incorreta.");
            }


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void exibirAlertaMensagem(String titulo, String mensagem) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null); // Sem cabeçalho adicional
        alerta.setContentText(mensagem);

        alerta.showAndWait();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}
