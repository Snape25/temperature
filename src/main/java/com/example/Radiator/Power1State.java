package com.example.Radiator;

public class Power1State implements RadiatorState
{
  private static final String POWER = "1";

  @Override public void turnUp(Radiator radiator)
  {
  Radiator.setPowerState(new Power2State());
  }

  @Override public void turnDown(Radiator radiator)
  {
  Radiator.setPowerState(new OffState());
  }

  @Override public String getPower()
  {
    return POWER;
  }
}
