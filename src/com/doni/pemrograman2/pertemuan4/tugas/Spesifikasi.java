package com.doni.pemrograman2.pertemuan4.tugas;

public class Spesifikasi extends Komputer{
   String CPU;
   int RAM;

   public Spesifikasi() {
   }

   public Spesifikasi(String CPU, int RAM) {
      this.CPU = CPU;
      this.RAM = RAM;
   }

   public Spesifikasi(String namaUser, String CPU, int RAM) {
      super(namaUser);
      this.CPU = CPU;
      this.RAM = RAM;
   }

   public void running(String namaProgram) {
      System.out.println(namaUser + " sedang menjalankan " + namaProgram + "!");
   }

   public void running() {
      System.out.println("Harap masukkan nama program!");
   }

   public void extraInfo() {
      System.out.println("CPU: " + CPU);
      System.out.println("RAM: " + RAM);
   }
}
