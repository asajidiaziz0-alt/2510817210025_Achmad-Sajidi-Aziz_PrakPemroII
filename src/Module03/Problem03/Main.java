package Module03.Problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String id = input.nextLine();

                    boolean doesIdAlreadyExist = false;
                    for (Student s : students) {
                        if (s.getId().equals(id)) {
                            doesIdAlreadyExist = true;
                            break;
                        }
                    }

                    if (doesIdAlreadyExist) {
                        System.out.println("NIM sudah ada");
                    } else {
                        students.add(new Student(name, id));
                        System.out.println("Mahasiswa " + name + " ditambahkan");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM yang akan dihapus: ");
                    String idDelete = input.nextLine();
                    boolean isIdFound = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getId().equals(idDelete)) {
                            isIdFound = true;
                            students.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + idDelete + " dihapus");
                            break;
                        }
                    }
                    if (!isIdFound) {
                        System.out.println("NIM tidak ditemuka");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang ingin dicari: ");
                    String idSearch = input.nextLine();

                    boolean isFoundSearch = false;
                    for (Student s : students) {
                        if (s.getId().equals(idSearch)) {
                            isFoundSearch = true;
                            System.out.println("NIM: " + s.getId() + ", Nama: " + s.getName());
                            break;
                        }
                    }

                    if (!isFoundSearch) {
                        System.out.println("NIM tidak ditemukan");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Student s : students) {
                        System.out.println("NIM: " + s.getId() + ", Nama: " + s.getName());
                    }
                    break;

                case 0:
                    students.clear();
                    System.out.println("Terima kasih!");
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
