package com.doni.pemrograman2.pertemuan2;

import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nama Anda: ");
    String nama = input.nextLine();

    System.out.println("Selamat datang, " + nama + "!");
  }
}
