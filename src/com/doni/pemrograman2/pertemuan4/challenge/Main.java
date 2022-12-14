package com.doni.pemrograman2.pertemuan4.challenge;

public class Main {
   public static void main(String[] args) {
      // pembuatan object
      Player p1 = new Player("Hero", 100f);
      Player p2 = new Player("Faker", 50f);
      Weapon w1 = new Weapon("Pedang Excalibur", 1000, 50f);
      Weapon w2 = new Weapon("Pedang Aerondight", 750, 25f);
      Potion exr = new Potion("Elixir of Earth", 200, 20f);
      Potion pdl = new Potion("Phial of Delusion", 100, 10f);

      // pemanggilan method
      System.out.println("=== Player 1 ===");
      p1.showHud();
      System.out.println("=== Player 2 ===");
      p2.showHud();

      // momen baku hantam
      System.out.println("\nMATCH START!");
      System.out.println(p1.getName() + " membeli " + w2.getName() + " seharga " + w2.getPrice() + "!");
      System.out.println(p2.getName() + " membeli " + w1.getName() + " seharga " + w1.getPrice() + "!");
      System.out.println(p2.getName() + " menyerang " + p1.getName() + "!");
      System.out.println(p1.getName() + " menerima serangan sebesar " + w1.getDamage() + "!");
      p1.setHp(p1.getHp() - w1.getDamage());
      System.out.println("Sisa HP " + p1.getName() + ": " + p1.getHp());
      System.out.println(p1.getName() + " membalas serangan " + p2.getName() + "!");
      System.out.println(p2.getName() + " menerima serangan sebesar " + w2.getDamage() + "!");
      p2.setHp(p2.getHp() - w2.getDamage());
      System.out.println("Sisa HP " + p2.getName() + ": " + p2.getHp());
      System.out.println(p2.getName() + " membeli " + pdl.getName() + " seharga " + pdl.getPrice() + "!");
      System.out.println(p2.getName() + " minum " + pdl.getName() + "!");
      System.out.println(p2.getName() + " mendapatkan healing sebesar " + pdl.getHealing() + "!");
      p2.setHp(p2.getHp() + pdl.getHealing());
      System.out.println("Sisa HP " + p2.getName() + ": " + p2.getHp());
      System.out.println(p1.getName() + " membeli " + exr.getName() + " seharga " + exr.getPrice() + "!");
      System.out.println(p1.getName() + " minum " + exr.getName() + "!");
      System.out.println(p1.getName() + " mendapatkan healing sebesar " + exr.getHealing() + "!");
      p1.setHp(p1.getHp() + exr.getHealing());
      System.out.println("Sisa HP " + p1.getName() + ": " + p1.getHp());
      System.out.println(p1.getName() + " menyerang " + p2.getName() + "!");
      System.out.println(p2.getName() + " menerima serangan sebesar " + w1.getDamage() + "!");
      p2.setHp(p2.getHp() - w1.getDamage());
      System.out.println("Sisa HP " + p2.getName() + ": " + p2.getHp());
      p2.showHud();
   }
}