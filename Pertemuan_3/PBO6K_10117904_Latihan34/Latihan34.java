package PBO6K_10117904_Latihan34;
/**
 *
 * @author
 * NAMA : Siti Safira Nadifa
 * KELAS : PBO-6K
 * NIM : 10117904
 * Deskripsi Program : Program kalkulator
 *
 */
import java.util.Scanner;
public class Latihan34 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Aplikasi Kalkulator Bilangan =====");
        System.out.print("Masukan Angka ke-1\t: ");
        double value1 = scanner.nextInt();
        System.out.print("Masukan Angka ke-2\t: ");
        double value2 = scanner.nextInt();
        System.out.println();

        Kalkulator hitung = new Kalkulator(value1, value2);
        hitung.tambahBilangan();
        hitung.kurangBilangan();
        hitung.kaliBilangan();
        hitung.bagiBilangan();
        hitung.sisaBilangan();
    }


}
