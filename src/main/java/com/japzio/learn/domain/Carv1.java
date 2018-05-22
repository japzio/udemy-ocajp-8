package com.japzio.learn.domain;

/**
 *
 * Creates a car that prints its description
 * @author jasper
 * @since 1.8
 *
 */


public class Carv1 {

  private String color;
  private String type;

  public Carv1(String color, String type) {
    this.color = color;
    this.type  = type;
  }

  public void start() {
    System.out.println("started successfully!");
  }

  public String getDescription() {
    return this.color + " " + this.type;
  }

}
