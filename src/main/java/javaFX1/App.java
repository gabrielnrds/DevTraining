package javaFX1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */i
public class App extends Application {

    public static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setMinHeight(600);
        stage.setMinWidth(960);
        this.stage = stage;
        stage.setResizable(false);
        FXMLLoader root = new FXMLLoader(App.class.getResource("telainicial.fxml"));
        Scene scene = new Scene(root.load());

        stage.setScene(scene);
        stage.setTitle("DevTraining");
        stage.show();
        

    }


    public static void trocartela(Parent janela) {
        Scene scene = new Scene(janela);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }

}