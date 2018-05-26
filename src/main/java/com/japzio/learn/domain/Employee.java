package com.japzio.learn.domain;

public class Employee extends Person {

  private MyDate hireDate;
  private int salary;

  public MyDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(MyDate hireDate) {
    this.hireDate = hireDate;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

}
