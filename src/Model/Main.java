package Model;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    static Stage window;


    @Override
    public void start(Stage stage) throws Exception{
        window = stage;
        BorderPane bp = (BorderPane) FXMLLoader.load(Main.class.getResource("/View/PrimaryWindow.fxml"));
        window.setScene(new Scene(bp));
        window.setTitle("Window 1");
        window.show();
    }

    public static void mainwindow () throws Exception
    {
        BorderPane bp = (BorderPane) FXMLLoader.load(Main.class.getResource("/View/PrimaryWindow.fxml"));
        window.setScene(new Scene(bp));
        window.setTitle("Window 1");
        window.show();
    }

    public static void departure () throws Exception
    {
        BorderPane bp = (BorderPane) FXMLLoader.load(Main.class.getResource("/View/DepartureWindow.fxml"));
        window.setScene(new Scene(bp));
        window.setTitle("Window 1");
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}