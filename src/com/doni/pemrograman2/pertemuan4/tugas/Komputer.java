package com.doni.pemrograman2.pertemuan4.tugas;

public class Komputer {
   String namaUser;

   public Komputer() {
   }

   public Komputer(String namaUser) {
      this.namaUser = namaUser;
   }

   public void aktifkan() {
      System.out.println(namaUser + " telah mengaktifkan komputer!");
   }

   public void showInfo() {
      System.out.println("Nama user: " + namaUser);

      extraInfo();
   }

   public void extraInfo() {}
}