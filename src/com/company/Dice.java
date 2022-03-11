package com.company;

public class Dice {

  private int faceValue;

  public void rollMethod(){
    this.faceValue =(int) (Math.random() * 6 + 1);
  }

  public int getFaceValue() {
    return faceValue;
  }

}
