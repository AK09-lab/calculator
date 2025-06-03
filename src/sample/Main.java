package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator (JavaFX App)");
        primaryStage.setScene(new Scene(root, 435, 560));

        Image icon = new Image(getClass().getResource("/resources/icon.png").toExternalForm());
        primaryStage.getIcons().add(icon);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}