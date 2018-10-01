import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Ejaan Nama
 *
 */
public class Latihan25EjaanNama {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nama;

        System.out.println("\n====== Program Perbandungan Nilai ======\n\n");
        System.out.print("Masukan Nama depan anda untuk di eja : ");
        nama = scanner.nextLine();

        System.out.println("\n\nEjaan untuk \"".concat(nama).concat("\" adalah :"));

        for (int i = 0; i < nama.length(); i++) {
            System.out.println(
                    "Huruf ke-"
                            .concat(String.valueOf(i + 1))
                            .concat(" : ")
                            .concat(String.valueOf(nama.charAt(i)))
            );
        }
    }

}
