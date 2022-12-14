package com.doni.pemrograman2.pertemuan3.tugas;

public class Main {
   public static void main(String[] args) {
      // membuat objek mobil
      Vehicle car = new Vehicle("Mobil", 4, 5);
      car.showInfo();

      // membuat objek motor
      Vehicle motorcycle = new Vehicle("Motor", 2, 2);
      motorcycle.showInfo();

      // membuat objek pesawat
      Vehicle airplane = new Vehicle("Pesawat", 3, 100);
      airplane.showInfo();
   }
}
