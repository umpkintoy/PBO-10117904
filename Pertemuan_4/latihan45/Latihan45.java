package latihan45;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Siti Safira Nadifa
 * KELAS    : PBO6K
 * NIM      : 10117904
 * Penjelasan Program : Program cetak nama
 * 
 */

public class Latihan45 {

    public static void main(String[] args) {
        
        Scanner namaScanner = new Scanner(System.in);
        Scanner numScanner = new Scanner(System.in);
        
        Printer printer = new Printer();
        System.out.print("Masukan nama anda\t\t: ");
        printer.setNama(namaScanner.nextLine());
        System.out.print("Mau cetak nama berapa kali?\t: ");
        printer.setJmlCetak(numScanner.nextInt());
        
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
