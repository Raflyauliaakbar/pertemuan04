package pertemuan04;

import java.util.Scanner;

public class percabanganIfElse {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = scanner.nextInt();

        // Percabangan if-else
        if (angka > 0) {
            System.out.println("Angka ini positif.");
        } else if (angka < 0) {
            System.out.println("Angka ini negatif.");
        } else {
            System.out.println("Angka ini nol.");
        }
    } 
}