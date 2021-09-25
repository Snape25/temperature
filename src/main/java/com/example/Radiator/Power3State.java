package com.example.Radiator;

import com.example.heatapp.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Power3State implements RadiatorState
{



  Thread thread1;
  private static final String  POWER = "3";

  public Power3State(Radiator radiator)
  {
    Runnable runnable = () ->
    {
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      Radiator.setPowerState(new Power2State());




    };
    thread1 = new Thread(runnable);
    thread1.setDaemon(true);
    thread1.start();

  }

  @Override public void turnUp(Radiator radiator)
  {

  }

  @Override public void turnDown(Radiator radiator)
  {
  Radiator.setPowerState(new Power2State());
  }

  @Override public String getPower()
  {
    return POWER;
  }
}
