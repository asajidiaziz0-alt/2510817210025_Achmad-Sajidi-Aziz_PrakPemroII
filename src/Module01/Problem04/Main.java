package Module01.Problem04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] abuHand = new char[3];
        // TODO: Buat char array bagasHand dengan sintaks yang sama seperti di atas
        char[] bagasHand = new char[3];

        System.out.print("Tangan Abu: ");
        for (int i = 0; i < 3; i++) {
            abuHand[i] = input.next().charAt(0);
        }
        // TODO: Buat statement yang sama seperti di atas untuk Bagas
        System.out.print("Tangan Bagas: ");
        for (int i = 0; i < 3; i++) {
            bagasHand[i] = input.next().charAt(0);
        }
        // TODO: Buat dua variabel untuk menyimpan skor Abu dan Bagas
        int skorAbu = 0;
        int skorBagas = 0;

        for (int i = 0; i < 3; i++) {
            char a = abuHand[i];
            char b = bagasHand[i];

            if (a != b) {
                if ((a == 'B' && b == 'G') || (a == 'G' && b == 'K') || (a == 'K' && b == 'B')) {
                    // TODO: Skor siapa yang naik?
                    skorAbu++;
                }
                else {
                    // TODO: Skor siapa yang naik?
                    skorBagas++;
                }
            }
        }

        // TODO: Buat if ... else if ... else statement untuk menampilkan nama pemenang atau "Seri" sesuai skor tertinggi
        if (skorAbu > skorBagas) {
            System.out.println("Abu");
        }else if (skorBagas > skorAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}
