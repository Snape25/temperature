package com.example.heatapp;

import com.example.Radiator.OffState;
import com.example.Radiator.Radiator;


import com.example.TempCalc.Thermometer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {




    public static void main(String[] args) {


        Thermometer thermometer1 = new Thermometer("Thermometer1", 15);
        Radiator.currentState = new OffState();
        Thread thread1 = new Thread(thermometer1);

        thread1.start();
       Application.launch(args);




    }




    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



}

