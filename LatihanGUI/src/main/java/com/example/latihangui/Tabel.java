package com.example.latihangui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();
        tabel.setPlaceholder(new Label("Belum ada data!"));

        TableColumn<Orang, String> kolom1 = new TableColumn<>("NAMA");

        kolom1.setCellValueFactory(
                new PropertyValueFactory<>("nama")
        );

        tabel.getColumns().add(kolom1);

        tabel.getItems().add(new Orang("Agus"));
        tabel.getItems().add(new Orang("Agus"));
        tabel.getItems().add(new Orang("Agus"));
        tabel.getItems().add(new Orang("Agus"));
        tabel.getItems().add(new Orang("Agus"));
        tabel.getItems().add(new Orang("Agus"));
        tabel.getItems().add(new Orang("Agus"));
        tabel.getItems().add(new Orang("Agus"));

        VBox box = new VBox(tabel);

        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
