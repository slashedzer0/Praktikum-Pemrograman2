package com.doni.pemrograman2.pertemuan6;

public class TryCatch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.println(array[0]);
            System.out.println("Proses selesai!");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan pada array!");
        }
    }
}
