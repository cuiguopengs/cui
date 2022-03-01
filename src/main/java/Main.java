import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
        primaryStage.setScene(new Scene(new Button("BUTTON"),200,200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
