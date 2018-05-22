package com.japzio.learn.collection.set;

import java.util.*;

public class HashSetSample {

  public static void main(String... args) {

   Set<String> mySet = new HashSet<>();

   mySet.add("jasper");
   mySet.add("ebeth");
   mySet.add("dioscora");
   mySet.add("jasper");

   System.out.println(mySet);

   if (mySet.contains("jasper")) {
     System.out.println("[*] valid user!");
   } else {
     System.out.println("[x] invalid user!");
   }

  }

}
