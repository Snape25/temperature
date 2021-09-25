package com.example.Radiator;

import com.example.Observer.Model;

import java.util.ArrayList;
import java.util.List;

public class Radiator
{


  public static RadiatorState currentState;


  public void turnUp()
  {
    currentState.turnUp(this);

  }

  public void turnDown()
  {
    currentState.turnDown(this);

  }

  public String getPower()
  {
    return currentState.getPower();
  }

  static void setPowerState(RadiatorState radiatorState){
    currentState = radiatorState;
    Model.setState(radiatorState);



  }






}
