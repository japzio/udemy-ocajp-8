package com.japzio.learn.domain;

/**
 *
 * Creates a car that prints its description
 * @author jasper
 * @since 1.8
 *
 */

public class Carv2 {

  String color;
  String type;
  int serialNumber;
  static int carCount;

  Carv2(){
    carCount++;
    serialNumber = carCount;
  }

  Carv2(String color, String type){
    this.color = color;
    this.type  = type;
  }

  String getDescription(){
    return "This is a " + color + " " + type;
  }

  void customize(String newColor, String newType) {
    color = newColor;
    type  = newType + " " + type;
    System.out.println("After customization : " + getDescription());
  }

}
