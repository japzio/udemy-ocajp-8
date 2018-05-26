package com.japzio.learn.collection.list;

import com.japzio.learn.domain.MyDate2;

import java.util.Arrays;

public class ArrayListComparator {

  public static void main(String... args) {

    MyDate2[] myDates = {
            new MyDate2(30, 3, 2018),
            new MyDate2(20, 4, 2017),
            new MyDate2(1, 6, 2017),
            new MyDate2(1, 6, 2015),
    };

    Arrays.sort(myDates);

    for(MyDate2 d : myDates) {
      System.out.println(d.day + " " + d.month + " " + d.year);
    }

  }

}
