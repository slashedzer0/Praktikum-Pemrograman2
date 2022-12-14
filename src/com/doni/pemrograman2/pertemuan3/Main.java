package com.doni.pemrograman2.pertemuan3;

public class Main {
  public static void main(String[] args) {
    // pembuatan object dari class Animal
    Animal dog = new Animal("Shiba", 3);
    Animal penguin = new Animal("Tux", 2);
    Animal kong = new Animal("Harambe Jr", 6);

    // ujicoba pemanggilan method
    dog.showInfo();
    penguin.showInfo();
    kong.showInfo();

    // ujicoba private/public
    System.out.println("Usia " + dog.getName() + " adalah " + dog.getAge() + " tahun");

    dog.setAge(4);
    System.out.println("Usia " + dog.getName() + " adalah " + dog.getAge() + " tahun");
  }
}
