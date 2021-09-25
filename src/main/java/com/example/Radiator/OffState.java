package com.example.Radiator;

public class OffState implements RadiatorState
{
  private static final String POWER = "0";


  @Override public void turnUp(Radiator radiator)
  {
    Radiator.setPowerState(new Power1State());
  }

  @Override public void turnDown(Radiator radiator)
  {

  }

  @Override public String getPower()
  {
    return POWER;
  }
}
