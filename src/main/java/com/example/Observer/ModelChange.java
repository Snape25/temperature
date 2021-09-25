package com.example.Observer;

public interface ModelChange {

    void changeState(String s);

    void changeTemp(double temp);

    void LowWarning(double temp);

    void HighWarning(double temp);
}
