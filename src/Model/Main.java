package Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/PrimaryWindow.fxml"));
        BorderPane load = (BorderPane) loader.load();

        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.setTitle("Window 1");
        stage.show();
    }

    public void departure() throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/DepartureWindow.fxml"));
        AnchorPane load = (AnchorPane) loader.load();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
