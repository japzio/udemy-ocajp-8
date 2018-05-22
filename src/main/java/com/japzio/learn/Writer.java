package com.japzio.learn;


abstract class Writer {
  public static void write() {
    System.out.println("Writing...");
  }
}
class Author extends Writer {
  public static void write() {
    System.out.println("Writing book");
  }
}

class Programmer extends Writer {
  public static void write() {
    System.out.println("Writing code");
  }
  public static void main(String[] args) {
    Writer w = new Programmer();
    w.write();
  }
}