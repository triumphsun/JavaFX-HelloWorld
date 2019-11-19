package com.suntri;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GuiApplication extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        btn.setText("Button");
        btn.setLayoutX(100);
        btn.setLayoutY(100);

        Group root = new Group();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 800, 600);
        scene.setFill(Color.DARKGREY);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Sample Title");
        primaryStage.show();
    }

    public static void main(String [] args){
        javafx.application.Application.launch(args);
    }

}
