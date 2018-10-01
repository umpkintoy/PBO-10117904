import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Waktu sekarang
 *
 */

public class Latihan27Huruf {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sentence;

        System.out.print("Masukan Kalimat\t: ");
        sentence =  scanner.nextLine();

        System.out.println("\nHuruf Besar : ".concat(sentence.toUpperCase()));
        System.out.println("Huruf Kecil : ".concat(sentence.toLowerCase()));
    }
}
