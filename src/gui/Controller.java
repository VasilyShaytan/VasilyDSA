package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.Registration;

import static functions.Function.PrintConsole;

import java.io.IOException;


public class Controller{
    //@FXML
    //private Button myButton;

    public void loginButtonClicked() throws IOException {

        Stage secondaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../gui/client.fxml"));
        secondaryStage.setTitle("Client");
        secondaryStage.setScene(new Scene(root, 500, 360));
        secondaryStage.show();

    }
    public void registrationButtonClicked() throws IOException {
        Stage secondaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../gui/registration.fxml"));
        secondaryStage.setTitle("Registration");
        secondaryStage.setScene(new Scene(root, 500, 360));
        secondaryStage.show();
    }

}
