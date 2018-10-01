import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Perbandingan dua buah nilai
 *
 */
public class Latihan24PerbandinganNilai {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nilaiA, nilaiB;

        System.out.println("\n======== Program Perbandungan Nilai ========\n\n");
        System.out.print("Masukan Nilai Pertama\t: ");
        nilaiA = scanner.nextInt();
        System.out.print("Masukan Nilai Kedua\t: ");
        nilaiB = scanner.nextInt();

        System.out.println(
                "\n\nHasil : "
                        .concat(String.valueOf(nilaiA))
                        .concat((nilaiA == nilaiB ? " Sama dengan " : (nilaiA > nilaiB ? " Lebih besar dari " : " Lebih kecil dari ")))
                        .concat(String.valueOf(nilaiB))
        );


    }

}
