package com.doni.pemrograman2.pertemuan4.challenge;

public class Item {
   private String name;
   private int price;

   public Item(String name, int price) {
      this.name = name;
      this.price = price;
   }

   public void showInfo() {
      System.out.println("Nama: " + name);
      System.out.println("Harga: " + price);

      extraInfo();
   }

   public void extraInfo() {}

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }
}
