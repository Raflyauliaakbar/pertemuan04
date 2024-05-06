package pertemuan04;

import java.util.Scanner;

public class percabanganswitch {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan kode warna baju (R, G, B, Y): ");
        char kodeWarna = scanner.next().charAt(0);

        switch (kodeWarna) {
            case 'R','r':
                System.out.println("Baju berwarna merah.");
                break;
            case 'G','g':
                System.out.println("Baju berwarna hijau.");
                break;
            case 'B','b':
                System.out.println("Baju berwarna biru.");
                break;
            case 'Y','y':
                System.out.println("Baju berwarna Kuning.");
                break;
            default:
                System.out.println("Kode warna tidak valid.");
        }
    }  
}
