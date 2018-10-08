package PBO6K_10117904_Latihan35;
/**
 *
 * @author
 * NAMA : Siti Safira Nadifa
 * KELAS : PBO-6K
 * NIM : 10117904
 * Deskripsi Program : Program tunjangan gaji
 *
 */
import java.util.Scanner;

public class Latihan35 {
    public static void main(String[] args) {
        double gajiPokok;
        String status;

        Tunjangan potTunjangan = new Tunjangan();
        Scanner scn = new Scanner(System.in);

        System.out.println("=========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan ? : Rp. ");
        gajiPokok = scn.nextDouble();

        System.out.print("Status Anda ? (Menikah/Belum) ? : ");
        status = scn.next();

        System.out.println();
        potTunjangan.hasilTunjangan(gajiPokok, status);
    }
}
