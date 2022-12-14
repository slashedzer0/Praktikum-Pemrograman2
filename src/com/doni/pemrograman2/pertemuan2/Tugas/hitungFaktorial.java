package com.doni.pemrograman2.pertemuan2.Tugas;

import java.util.Scanner;

public class hitungFaktorial {
   public static void main(String[] args) {
      int i, n, f = 1;

      Scanner input = new Scanner(System.in);
      System.out.println("Masukkan sebuah bilangan bulat: ");
      n = input.nextInt();

      for (i = 1; i <= n; i++) {
         f = f * i;
      }

      System.out.println("Faktorial dari " + n + " adalah " + f);
   }
}
