package com.doni.pemrograman2.pertemuan3.challenge;

public class Weapon {
   public String name;
   private float damage;

   public Weapon(String name, float damage) {
      this.name = name;
      this.damage = damage;
   }

   public void extraInfo() {
      System.out.println("Damage: " + damage);
   }

   public float getDamage() {
      return damage;
   }

   public void setDamage(float damage) {
      this.damage = damage;
   }
}