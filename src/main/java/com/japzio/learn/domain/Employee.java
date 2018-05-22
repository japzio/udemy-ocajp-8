package com.japzio.learn.domain;

import com.japzio.learn.functional.Payable;

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
