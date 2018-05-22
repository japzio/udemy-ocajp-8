package com.japzio.learn;

import com.japzio.learn.domain.DayOfTheWeek;

public class ApplicationTestEmum {

  public static void main(String args[]) {

    DayOfTheWeek dayOfTheWeek = DayOfTheWeek.FRIDAY;

    if (dayOfTheWeek.equals(DayOfTheWeek.MONDAY)) {
      System.out.print("night out coz it's weekend!");
    } else {
      System.out.print("sleep early!");
    }

  }

}
