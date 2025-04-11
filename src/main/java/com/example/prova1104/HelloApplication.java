package com.example.prova1104;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.text.html.ListView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private Button addTarefa;
    @FXML
    private Button visuTarefa;
    @FXML
    private Button marcaTarefa;
    @FXML
    private TextField titulo;
    @FXML
    private TextField descricao;
    @FXML
    private TextField prioridade;
    @FXML
    private ListView listaTarefa;

    public static void main(String[] args) {
        launch();
    }
}