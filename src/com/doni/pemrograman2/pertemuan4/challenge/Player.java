package com.doni.pemrograman2.pertemuan4.challenge;

public class Player {
   private String name;
   private Float hp;

   public Player(String name, Float hp) {
      this.name = name;
      this.hp = hp;
   }

   public void showHud() {
      if (hp <= 0) {
         System.out.println(name + " dikalahkan.");
      }
      else {
         System.out.println("Nama: " + name);
         System.out.println("HP: " + hp);
      }
   }

   public void attack(Weapon weapon) {
      System.out.println("Damage: " + weapon.getDamage());
   }

   public void heal(Potion potion) {
      System.out.println("Healing: " + potion.getHealing());
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Float getHp() {
      return hp;
   }

   public void setHp(Float hp) {
      this.hp = hp;
   }
}
