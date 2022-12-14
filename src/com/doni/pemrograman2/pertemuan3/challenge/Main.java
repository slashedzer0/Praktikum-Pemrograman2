package com.doni.pemrograman2.pertemuan3.challenge;

public class Main {
   public static void main(String[] args) {
      // membuat 1 objek hero
      Hero hero1 = new Hero("Ucok", 100);

      // membuat beberapa objek weapon
      Weapon weapon1 = new Weapon("Silver Sword", 15);
      Weapon weapon2 = new Weapon("Bambu Runcing", 10);
      Weapon weapon3 = new Weapon("Epic Sword", 50);

      // membuat beberapa objek armor
      Armor armor1 = new Armor("Armor Lv3", 15);
      Armor armor2 = new Armor("Armor Lv5", 25);
      Armor armor3 = new Armor("Armor MAX", 50);

      // ujicoba
      hero1.wear(armor1);
      hero1.attack(weapon1);

      hero1.wear(armor2);
      hero1.attack(weapon2);

      hero1.wear(armor3);
      hero1.attack(weapon3);
   }
}