package Controller;

import Model.Main;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void goToWindow2(ActionEvent event) {
        try {
           new departure();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
