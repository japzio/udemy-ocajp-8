package com.japzio.learn.domain;

public class Person {

  private String firstName;
  private String lastName;
  private Address homeAddress;
  private MyDate dob;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public MyDate getDob() {
    return dob;
  }

  public void setDob(MyDate dob) {
    this.dob = dob;
  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public Address getHomeAddress() {
    return this.homeAddress;
  }

}
