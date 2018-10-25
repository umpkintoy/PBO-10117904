package latihan47;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Siti Safira Nadifa
 * KELAS    : PBO6K
 * NIM      : 10117904
 * Penjelasan Program : Program nilai mahasiswa
 * 
 */

public class Latihan47 {

    public static void main(String[] args) {
        
        Scanner numScanner = new Scanner(System.in);
        Nilai nilai = new Nilai();
        
        System.out.print("Quiz\t = ");nilai.setQuiz(numScanner.nextDouble());
        System.out.print("UTS\t = ");nilai.setUts(numScanner.nextDouble());
        System.out.print("UAS\t = ");nilai.setUas(numScanner.nextDouble());
        
        System.out.println("");
        
        System.out.println("Nilai Akhir\t= " + nilai.getNilaiAkhir());
        System.out.println("Index\t\t= " 
                + nilai.tentukanIndex(nilai.getNilaiAkhir()));
        System.out.println("Keterangan\t= " 
                + nilai.tentukanKeterangan(nilai.getIndex()));
    }
    
}
