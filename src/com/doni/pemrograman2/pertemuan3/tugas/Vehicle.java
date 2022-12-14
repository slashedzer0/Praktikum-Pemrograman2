package com.doni.pemrograman2.pertemuan3.tugas;

public class Vehicle {
   private String name;
   private int wheels;
   private int passengers;

   // constructor
   public Vehicle(String name, int wheels, int passengers) {
      this.name = name;
      this.wheels = wheels;
      this.passengers = passengers;
   }

   // method
   public void showInfo() {
      System.out.println("Nama: " + name);
      System.out.println("Roda: " + wheels);
      System.out.println("Penumpang: " + passengers);
      System.out.println();
   }

   // getter and setter
   public String getName() { return name; }

   public void setName(String name) { this.name = name; }

   public int getWheels() { return wheels; }

   public void setWheels(int wheels) { this.wheels = wheels; }

   public int getPassengers() { return passengers; }

   public void setPassengers(int passengers) { this.passengers = passengers; }
}
