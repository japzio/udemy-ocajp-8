package com.japzio.learn.collection.list;

import com.japzio.learn.domain.MyDate;

import java.util.Arrays;

public class ArrayListComparable {

  public static void main(String... args) {

    MyDate[] myDates = {
            new MyDate(30, 3, 2018),
            new MyDate(20, 4, 2017),
            new MyDate(1, 6, 2017),
            new MyDate(1, 6, 2015),
    };

    Arrays.sort(myDates);

    for(MyDate d : myDates) {
      System.out.println(d.day + " " + d.month + " " + d.year);
    }

  }

}
