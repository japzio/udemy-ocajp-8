package com.japzio.learn.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListSample {

  public static void main(String... args) {

    List<String> myList = new ArrayList<>();

    myList.add("jasper");
    myList.add("dioscora");
    myList.add("ebeth");

    System.out.println(myList);
    System.out.println("Size : " + myList.size());

    Iterator iterator = myList.iterator();

    while ( iterator.hasNext() ) {
      System.out.println(iterator.next());
    }

  }

}
