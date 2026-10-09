package Module01.Problem05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static final double PHI = 3.14;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // TODO: Buat statement print() untuk meminta nilai jari-jari dan variabel untuk menyimpannya
        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();

        // TODO: Buat statement print() untuk meminta nilai radius dan variabel untuk menyimpannya
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        // TODO: Buat variabel untuk menampung nilai dari kalkulasi volume tabung
        double volumeTabung = PHI * jariJari * jariJari * tinggi;

        // TODO: Buat statement printf() untuk menampilkan volume tabung sesuai dengan format di Lembar Kerja Praktikum
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", jariJari, tinggi, volumeTabung);
    }
}