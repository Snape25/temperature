package com.example.heatapp;

import com.example.Observer.Model;
import com.example.Observer.ModelChange;
import com.example.Radiator.Radiator;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller implements ModelChange {


    Model model = new Model();

    @FXML
    TextField text1;

    @FXML
    TextField text2;

    @FXML
    Label warning;

    @FXML
    TextField temp1;

    @FXML
    TextField temp2;


    public void submit(ActionEvent e){
        String high  = temp1.getText();
        String low = temp2.getText();

        Model.HIGH_TEMP = Double.valueOf(high);
        Model.LOW_TEMP = Double.valueOf(low);

    }


    public void TurnOn(ActionEvent e){
        if(Model.listeners.size()==0) {
            model.registerAddedListener(this);
        }
        text1.setEditable(false);
        text2.setEditable(false);
    }

    public void up(ActionEvent e){
        Radiator radiator = new Radiator();
        radiator.turnUp();
        radiator.getPower();




    }
    public void down(ActionEvent e){
        Radiator radiator = new Radiator();
        radiator.turnDown();
        radiator.getPower();



    }




    @Override
    public void changeState(String s) {
        text1.setText(Radiator.currentState.getPower());
    }

    @Override
    public void changeTemp(double temp) {
       text2.setText(String.valueOf(temp));
       System.out.println(temp);

    }

    @Override
    public void LowWarning(double temp) {
        Platform.runLater(new Runnable() {
            @Override public void run() {
                warning.setText("Too Low");
            }
        });
    }

    @Override
    public void HighWarning(double temp) {
        Platform.runLater(new Runnable() {
            @Override public void run() {
                warning.setText("Too High");
            }
        })
    ;}


}
