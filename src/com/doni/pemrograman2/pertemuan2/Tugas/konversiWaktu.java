package com.doni.pemrograman2.pertemuan2.Tugas;

import java.util.Scanner;

public class konversiWaktu {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int detik, menit, jam, sisaDetik, sisaMenit;

      System.out.print("Masukkan detik: ");
      detik = input.nextInt();

      jam = detik / 3600;
      sisaDetik = detik % 3600;
      menit = sisaDetik / 60;
      sisaMenit = sisaDetik % 60;

      System.out.println(detik + " detik = " + jam + " jam " + menit + " menit " + sisaMenit + " detik");
   }
}
