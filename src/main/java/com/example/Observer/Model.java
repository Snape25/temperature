package com.example.Observer;

import com.example.Radiator.Radiator;
import com.example.Radiator.RadiatorState;

import java.util.ArrayList;
import java.util.List;

public class Model {


    public static double  temp;
    public static RadiatorState state;
    public static List<ModelChange> listeners = new ArrayList<>();
    public  static double HIGH_TEMP=100;
    public static double LOW_TEMP = 20;


    public double getTemp() {
        return temp;
    }

    public static  void setTemp(double temp1) {
        temp = temp1;
        if(temp1 > HIGH_TEMP){
         notifyHighWarning(temp1);
        }
        if(temp1 < LOW_TEMP){
           notifyLowWarning(temp1);
        }
        notifyTempListener(temp1);
    }

    public RadiatorState getState() {
        return state;
    }

    public static  void setState(RadiatorState state1) {
        state = state1;
        notifyStateListener(state1);
    }

    public void registerAddedListener (ModelChange listener) {
        // Add the listener to the list of registered listeners
        listeners.add(listener);
    }

    public void unregisterAddedListener (ModelChange listener) {
        // Remove the listener from the list of the registered listeners
        listeners.remove(listener);
    }


    static void notifyHighWarning(double temp){
        for(int i =0;i<listeners.size();i++){
            listeners.get(i).HighWarning(temp);
        }
    }

    static void notifyLowWarning(double temp){
        for(int i =0;i<listeners.size();i++){
            listeners.get(i).LowWarning(temp);
        }

    }

    static void notifyTempListener(double temp){
        for(int i =0;i<listeners.size();i++){
            listeners.get(i).changeTemp(temp);
        }
    }

    static void notifyStateListener (RadiatorState state){
        // Notify each of the listeners in the list of registered listeners
        for(int i =0;i<listeners.size();i++){
            listeners.get(i).changeState(Radiator.currentState.getPower());
        }
    }





}
