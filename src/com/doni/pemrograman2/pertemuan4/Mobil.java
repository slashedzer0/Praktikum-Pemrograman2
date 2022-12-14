package com.doni.pemrograman2.pertemuan4;

public class Mobil extends Kendaraan{
   int jmlPintu;
   String bahanBakar;

   public Mobil() {}

   public Mobil(int jmlPintu, String bahanBakar) {
      this.jmlPintu = jmlPintu;
      this.bahanBakar = bahanBakar;
   }

   public Mobil(String nama, int jmlRoda, int jmlPintu, String bahanBakar) {
      super(nama, jmlRoda);
      this.jmlPintu = jmlPintu;
      this.bahanBakar = bahanBakar;
   }

   public void belok(String arah){
      System.out.println("Mobil " + nama + " belok ke " + arah + "!");
   }

   public void belok(){
      System.out.println("Harap masukkan arah!");
   }

   public void extraInfo(){
      System.out.println("Jumlah pintu: " + jmlPintu);
      System.out.println("Bahan bakar: " + bahanBakar);
   }
}
