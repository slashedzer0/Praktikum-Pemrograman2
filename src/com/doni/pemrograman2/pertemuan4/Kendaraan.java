package com.doni.pemrograman2.pertemuan4;

public class Kendaraan {
   String nama;
   int jmlRoda;

   public Kendaraan() {
   }

   public Kendaraan(String nama, int jmlRoda) {
      this.nama = nama;
      this.jmlRoda = jmlRoda;
   }

   public void nyalakanMesin(){
      System.out.println("Mesin " + nama + " telah dinyalakan!");
   }

   public void showInfo(){
      System.out.println("Nama kendaraan: " + nama);
      System.out.println("Jumlah roda: " + jmlRoda);

      extraInfo();
   }

   public void extraInfo(){}
}
