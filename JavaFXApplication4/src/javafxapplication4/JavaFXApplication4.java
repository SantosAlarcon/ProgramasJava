/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

/**
 *
 * @author FutuzorMekkla
 */
public class JavaFXApplication4 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(JavaFXApplication4.class, args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Trollolololo");
        primaryStage.setResizable(false);
        Group root = new Group();
        Scene scene = new Scene(root, 640, 480);
        primaryStage.setScene(scene);

        final ChoiceBox cb = new ChoiceBox();
        cb.getStyleClass().add("combo");

        cb.setTranslateX(200);
        cb.setTranslateY(200);
        cb.setStyle("-fx-font-size: 25px; -fx-text-fill: white;");

        cb.getItems().addAll("Trollololo","Eusebio","Tanuki","Azunyan");
        cb.getSelectionModel().selectFirst();

        final Slider des = new Slider();
        des.setTranslateY(scene.getHeight() - 20);
        des.setPrefSize(scene.getWidth(), 0);

        final Label indicador = new Label("" + (int) des.getValue());
        indicador.setTranslateY(scene.getHeight() - 50);
        indicador.setTranslateX(5);
        indicador.setStyle("-fx-font-size: 16px;");

        des.setOnMouseDragged(new EventHandler<MouseEvent>() {

            public void handle(MouseEvent event) {
                indicador.setText("" + (int) des.getValue());
            }

        });

        root.getChildren().addAll(cb,des,indicador);
        primaryStage.setVisible(true);

    }
}
