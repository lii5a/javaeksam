import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * Loo Label, mille sisu saab kasutaja TextFieldi kaudu muuta.
 */
public class JavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage=primaryStage;
        VBox boks = new VBox();
        Scene scene = new Scene(boks, 300, 300);

        TextField tekst = new TextField();
        Button OK = new Button("OK");

        Label label = new Label("Esialgne tekst");
        boks.getChildren().addAll(tekst, OK, label);


        OK.setOnAction(event -> {
                    label.setText(tekst.getText());
                }

        );

        stage.setScene(scene);
        stage.show();

    }
}
