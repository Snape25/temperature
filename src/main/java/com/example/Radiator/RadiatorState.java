package com.example.Radiator;

public interface RadiatorState
{
  void turnUp(Radiator radiator);

  void turnDown(Radiator radiator);

  String getPower();
}
