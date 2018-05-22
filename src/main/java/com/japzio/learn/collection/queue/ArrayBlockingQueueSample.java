package com.japzio.learn.collection.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueSample {

  public static void main(String... args) {

    Queue<String> myQueue = new ArrayBlockingQueue<>(5);

    myQueue.add("jasper");
    myQueue.add("weng");
    myQueue.add("david");
    myQueue.add("alrajiv");
    myQueue.add("kirby");

    System.out.println(myQueue);

    myQueue.remove("david");
    myQueue.poll();

    System.out.println(myQueue);
    System.out.println(((ArrayBlockingQueue<String>) myQueue).remainingCapacity());


  }

}
