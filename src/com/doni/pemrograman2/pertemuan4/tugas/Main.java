package com.doni.pemrograman2.pertemuan4.tugas;

public class Main {
   public static void main(String[] args) {
      Spesifikasi spec = new Spesifikasi("Doni", "Intel i7-12700H", 16);

      spec.showInfo();
      spec.aktifkan();
      spec.running("VS Code");
      spec.running();
   }
}
