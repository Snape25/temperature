package com.example.lesson1;

public class CounterIncrementor implements Runnable
{
  Counter counter = new Counter();
  private final int updates;
  CounterIncrementor(Counter counter, int updates)
  {
    this.counter = counter;
    this.updates = updates;
  }

  @Override
  public void run()
  {
    for(int i = 0; i < updates; i++)
    {
     counter.increment();
    }
  }

}
