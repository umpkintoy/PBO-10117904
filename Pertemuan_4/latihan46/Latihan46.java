package latihan46;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Siti Safira Nadifa
 * KELAS    : PBO6K
 * NIM      : 10117904
 * Penjelasan Program : Program tandanya kamu
 * 
 */

public class Latihan46 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Age age = new Age(2018);
        
        System.out.print("Masukan tahun lahir anda : "); age.setYearBirth(scanner.nextInt());

        System.out.println("=====Hasil Hitung Umur======");
        System.out.println("Tahun Lahir anda : "+ String.valueOf(age.getYearBirth()));
        System.out.println("Tahun ini tahun : "+ String.valueOf(age.getYearNow()));
        System.out.printf("Umur kamu sampai hari ini adalah %d tahun\n", age.hitungUmur());
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
    
}
