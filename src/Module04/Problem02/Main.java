package Module04.Problem02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nama Hewan Peliharaan: ");
        String inputName = input.nextLine();

        System.out.println("Ras: ");
        String inputBreed = input.nextLine();

        Pet pet = new Pet(inputBreed, inputName);
        pet.display();
    }
}
