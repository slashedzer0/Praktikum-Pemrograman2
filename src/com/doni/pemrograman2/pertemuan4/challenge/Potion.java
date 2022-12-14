package com.doni.pemrograman2.pertemuan4.challenge;

public class Potion extends Item {
      private Float healing;

      public Potion(String name, int price, Float healing) {
          super(name, price);
          this.healing = healing;
      }

      public void extraInfo() {
          System.out.println("Healing: " + healing);
      }

      public Float getHealing() {
          return healing;
      }

      public void setHealing(Float healing) {
          this.healing = healing;
      }
}
