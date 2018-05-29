package com.japzio.learn;


import com.japzio.learn.functional.Squarable;

public class FunctionalTest {

  public static void main(String... args) {

    Squarable square = (int x) ->  x * x;

    System.out.println(square.computeSquare(2));

  }

}
