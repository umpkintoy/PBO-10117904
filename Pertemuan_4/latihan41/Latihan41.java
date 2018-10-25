package latihan41;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Siti Safira Nadifa
 * KELAS    : PBO6K
 * NIM      : 10117904
 * Penjelasan Program : Program menghitung massa kubus
 * 
 */

public class Latihan41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kubus kubus = new Kubus();
        
        System.out.println("=== Massa Jenis Kubus ===");
        System.out.print("Sisi \t : ");kubus.setSisi(scanner.nextInt());
        System.out.print("Massa\t : ");kubus.setMassa(scanner.nextInt());
        
        System.out.println("");
        
        System.out.println("=== Hasil Pehitungan ===");
        System.out.println("Volume : "+kubus.hitungVolume());
        System.out.println("Massa : "+kubus.hitungMassa());
       
    }
    
}
