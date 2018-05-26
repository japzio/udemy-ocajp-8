package com.japzio.learn.domain;

import java.util.Comparator;

public class MyDate2 implements Comparator<MyDate> {

  public int day;
  public int month;
  public int year;

  public MyDate2() {}

  public MyDate2(int d, int m, int y) {
    day = d;
    month = m;
    year = y;
  }

  public void setDate(int d, int m, int y) {
    day = d;
    month = m;
    year = y;
  }

  public String toString() {
    return Integer.toString(day) + " " + Integer.toString(month) + ", " +  Integer.toString(year);
  }

  @Override
  public int compare(MyDate o1, MyDate o2) {

    if ( o1.year != o2.year ) {
      return o1.year - o2.year;
    }

    if ( o1.month != o2.month ) {
      return o1.month - o2.month;
    }

    if ( o1.day != o2.day ) {
      return o1.day - o2.day;
    }

    return 0;
  }
}
