package Module02.Problem01;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Fruit apel = new Fruit("Apel", 7000, 0.4, 40);
        Fruit mangga = new Fruit("Mangga", 3500, 0.2, 15);
        Fruit alpukat = new Fruit("Alpukay", 10000, 0.25, 12);

        apel.printInfo();
        mangga.printInfo();
        alpukat.printInfo();
    }
}