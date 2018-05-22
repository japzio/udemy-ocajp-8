package com.japzio.learn.domain;

public class MyDate {

  public int day;
  public int month;
  public int year;

  {
    day   = 1;
    month = 1;
    year  = 2000;
  }

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

}
