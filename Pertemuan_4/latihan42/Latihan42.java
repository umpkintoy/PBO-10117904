package latihan42;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Siti Safira Nadifa
 * KELAS    : PBO6K
 * NIM      : 10117904
 * Penjelasan Program : Program penarikan uang pada tabungan
 * 
 */

public class Latihan42 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan Saldo Awal\t : "); 
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah Uang Yang Diambil\t : ");
        System.out.println("Saldo anda sekarang\t\t: " 
                + tabungan.ambilUang(scanner.nextInt()));
         
    }
    
}
