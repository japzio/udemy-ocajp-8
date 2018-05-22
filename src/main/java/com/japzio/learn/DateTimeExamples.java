package com.japzio.learn;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeExamples {

  public static void p(Object o) {
    System.out.println(o);
  }

  public static void main(String args[]) {

    LocalDate now = LocalDate.now(); p(now);

    LocalDate hireDate = LocalDate.of(2013, Month.NOVEMBER,13); p(hireDate);

    LocalDate aWeekAgo = now.minusWeeks(1); p(aWeekAgo);

    now.minusWeeks(1); p(now);

    LocalDate aWeekFromNow = LocalDate.now().plusWeeks(1); p(aWeekFromNow);

    now = now.minusWeeks(2);

    p(now);

    p(hireDate.isBefore(now));

  }

}
