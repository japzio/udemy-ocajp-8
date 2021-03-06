package com.japzio.learn.domain;

public class MyDate implements Comparable<MyDate> {

  public int day;
  public int month;
  public int year;

  public MyDate() {}

  public MyDate(int d, int m, int y) {
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
  public int compareTo(MyDate myDate) {

    if ( year != myDate.year) {
      return year - myDate.year;
    }

    if ( month != myDate.month ) {
      return month - myDate.month;
    }

    if ( day != myDate.day ) {
      return day - myDate.day;
    }

    return 0;
  }
}
