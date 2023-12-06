package com.example.latihangui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");

        Label teks = new Label("Hello World");
        TextField nama = new TextField();
        Button input = new Button("submit");
        input.setOnAction(e -> {
            teks.setText("Halo " + nama.getText());
        });
        VBox box = new VBox(nama, input, teks);

        Scene scene = new Scene(box, 400, 200);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
