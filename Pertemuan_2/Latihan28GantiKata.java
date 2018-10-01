import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Ganti Kata
 *
 */
public class Latihan28GantiKata {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String kalimat, kataLama, kataBaru;

        System.out.print("Masukan Kalimat\t: ");
        kalimat =  scanner.nextLine();

        System.out.print("Ganti kata : ");
        kataLama =  scanner.nextLine();

        System.out.print("Menjadi kata : ");
        kataBaru =  scanner.nextLine();

        System.out.println("\n\n====================== Hasil Formatting ======================");
        System.out.println("Kalimat Awal\t: ".concat(kalimat));
        System.out.println("Kalimat Akhir\t: ".concat(kalimat.replaceAll(kataLama,kataBaru)));


    }
}
