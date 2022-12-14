package com.doni.pemrograman2.pertemuan3.challenge;

public class Hero {
   String name;
   float hp;

   Hero (String name, float hp) {
      this.name = name;
      this.hp = hp;
   }

   void attack(Weapon weapon) {
      System.out.println(name + " menyerang dengan " + weapon.name);
   }

   void wear(Armor armor) {
      System.out.println(name + " mengenakan " + armor.name);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public float getHp() {
      return hp;
   }

   public void setHp(float hp) {
      this.hp = hp;
   }
}
