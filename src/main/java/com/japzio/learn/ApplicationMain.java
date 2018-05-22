package com.japzio.learn;

import com.japzio.learn.domain.Carv1;
import com.japzio.learn.domain.MyDate;

/**
 * ApplicationMain
 * @author intertech udemy
 * @since 1.83
 */
public class ApplicationMain {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Carv1 myCarv1 = new Carv1("Silver", "DeLorean DMC-12");

        myCarv1.start();

        System.out.println("This is a " + myCarv1.getDescription());

        MyDate date1 = new MyDate(11, 11, 1918);
        MyDate date2 = new MyDate();

        date2.day = 11;
        date2.month = 11;
        date2.year  = 1918;

        MyDate date3 = new MyDate();
        date3.setDate(4,21,1968);

        MyDate date4 = new MyDate();

        String str1 = date1.toString();
        String str2 = date2.toString();
        String str3 = date3.toString();
        String str4 = date4.toString();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}
