package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        primaryStage.setTitle("Næstved Ungdomsskole");
        primaryStage.setScene(new Scene(root, 740, 449));
        primaryStage.setResizable(false);
        primaryStage.show();

        //Debugging
        System.out.println("Program startet.");
    }

    public static void main(String[] args) {
        // Starter programmet
        launch(args);
    }
}