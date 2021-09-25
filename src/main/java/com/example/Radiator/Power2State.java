package com.example.Radiator;

public class Power2State implements RadiatorState
{
  private static final String POWER = "2";

  @Override public void turnUp(Radiator radiator)
  {
    Radiator.setPowerState(new Power3State(radiator));
  }

  @Override public void turnDown(Radiator radiator)
  {
    Radiator.setPowerState(new Power1State());
  }

  @Override public String getPower()
  {
    return POWER;
  }
}
