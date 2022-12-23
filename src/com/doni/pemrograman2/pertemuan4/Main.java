package com.doni.pemrograman2.pertemuan4;

public class Main {
    public static void main(String[] args) {

        Mobil mb = new Mobil("VW Beetle", 4, 2, "Pertamax");

        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("Kanan");
        mb.belok();
    }
}
