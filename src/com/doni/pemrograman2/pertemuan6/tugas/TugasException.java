package com.doni.pemrograman2.pertemuan6.tugas;

import java.util.Arrays;
import java.util.List;

public class TugasException {
    public static void main(String[] args) {
        try {
            // Membuat array dengan ukuran negatif
            int[] numbers = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("Terjadi kesalahan dalam membuat array: " + e.getMessage());
        }

        try {
            // Mencoba menggunakan operasi untuk array
            List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
            int sum = numbersList.stream().mapToInt(Integer::intValue).sum();

            // Mengubah string "123abc" menjadi bilangan integer
            int result = Integer.parseInt("123abc");

            // Mencetak hasil operasi ke layar
            System.out.println("Hasil operasi: " + result);
        } catch (UnsupportedOperationException e) {
            System.out.println("Terjadi kesalahan dalam operasi array: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Gagal mengubah string ke bilangan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
