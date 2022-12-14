package com.doni.pemrograman2.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan bilangan: ");
            int bil1 = input.nextInt();

            System.out.println("Masukkan pembagi: ");
            int bil2 = input.nextInt();

            int hasil = bil1 / bil2;
            System.out.println(bil1 + " / " + bil2 + " = " + hasil + " (dibulatkan)");
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Pembagi tidak boleh 0!");
        }

        catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa bilangan bulat!");
        }

        System.out.println("Proses selesai!");
    }
}
