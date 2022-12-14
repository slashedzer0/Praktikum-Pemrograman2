package com.doni.pemrograman2.pertemuan2;

public class Loops {
   public static void main(String[] args) {
      // for loop
      for (int i = 0; i < 10; i++) {
         System.out.println("For loop ke-" + i);
      }
      System.out.println("For loop selesai. \n");

      // while loop
      int j = 1;
      while (j <= 100) {
         System.out.println("While loop ke-" + j);
         j += 10;
      }
      System.out.println("While loop selesai. \n");

      // do while loop
      int k = 10;
      do {
         System.out.println("Do While loop ke-" + k);
         k--;
      } while (k > 0);
      System.out.println("Do While loop selesai. \n");
   }
}
