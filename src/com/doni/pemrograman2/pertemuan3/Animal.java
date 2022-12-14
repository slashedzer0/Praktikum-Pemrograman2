package com.doni.pemrograman2.pertemuan3;

public class Animal {
  // attribute (variable)
  private String name;
  private int age;

  // constructor
  // cara cepat: [Alt] + [Insert] -> Constructor
  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // method (function)
  public void showInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age + " yrs old");
    System.out.println();
  }

  // getter and setter
  // cara cepat: [Alt] + [Insert] -> Getter and Setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() { return age; }

  public void setAge(int age) {
    this.age = age;
  }
}