package Module04.Problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan Pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String name = scanner.nextLine();
        System.out.print("Ras: ");
        String breed = scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Warna Bulu: ");
            String furColor = scanner.nextLine();
            Cat cat = new Cat(breed, name, furColor);
            cat.displayCatDetails();
        } else {
            System.out.print("Warna Bulu: ");
            String furColor = scanner.nextLine();
            System.out.print("Kemampuan : ");
            String skills = scanner.nextLine();
            Dog dog = new Dog(breed, name, furColor, skills);
            dog.displayDogDetails();
        }
    }
}