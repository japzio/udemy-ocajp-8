package com.japzio.learn;

public class ExceptionHandlingSample {

  public static void main(String... args) {
    String str = "Exception handling";

    System.out.println("before problem");

    try {
      char chr = str.charAt(30);
    } catch ( Exception e ) {
      System.out.println(e.getMessage());
    }
    System.out.println("after problem");
  }

}
