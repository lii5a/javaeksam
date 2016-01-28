import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by lii5a on 27/01/16.
 *
 * Joonista ring, mille suurust saab kasutaja Slideriga muuta
 */
public class slider extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = primaryStage;
        StackPane stack = new StackPane();
        Scene scene =  new Scene(stack,400,400);
        Circle circle = new Circle(200);

        Slider slider = new Slider(0,200,100);

        slider.setOnDragDetected(event -> {
                    circle.setRadius(slider.getValue());
                }
        );

        stack.getChildren().addAll(circle,slider);

        stage.setScene(scene);
        stage.show();
    }
}
