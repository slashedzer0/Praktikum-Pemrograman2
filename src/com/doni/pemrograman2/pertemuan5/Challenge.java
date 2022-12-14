package com.doni.pemrograman2.pertemuan5;

public class Challenge {
    public static void main(String[] args) {
        // membuat array kosong
        Barang[] keranjang = new Barang[10];

        // mengisi array secara langsung
        Barang[] etalase = {
                new Barang("Kaleng Sarden", 10_000),
                new Barang("Susu Kotak", 5_500),
                new Barang("Wafer Nabati", 8_000),
                new Barang("Minyak Goreng", 15_000),
                new Barang("Sandwich", 6_000)
        };

        // memasukkan barang dari etalase ke keranjang
        for (int i = 0; i < etalase.length; i++) {
            keranjang[i] = etalase[i];
        }

        // menampilkan panjang array
        System.out.println("Jumlah barang di etalase: " + etalase.length);

        // menampilkan isi array
        System.out.println("Daftar barang di etalase: ");
        int i = 1;

        // for each - perulangan dengan menggunakan sebuah object
        for (Barang b : etalase) {
            System.out.println("Barang ke-" + i);
            b.showInfo();
            i++;
        }

        // for i - perulangan biasa
        for (int x = 0; x < etalase.length; x++) {
            System.out.println("Barang ke-" + (x+1));
            etalase[x].showInfo();
        }
    }
}
