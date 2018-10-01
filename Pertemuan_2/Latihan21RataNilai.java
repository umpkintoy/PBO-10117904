import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Program Rata-rata nilai
 *
 */

public class Latihan21RataNilai {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int jumlahMahasiswa = 0;
        double total = 0.0;
        int[] nilaiMahasiswa;

        System.out.println("Masukan Banyaknya Mahasiswa: ");
        jumlahMahasiswa = scanner.nextInt();

        nilaiMahasiswa = new int[jumlahMahasiswa];

        for(int i = 0; i < jumlahMahasiswa; i+=1){
            System.out.printf(
                    "Nilai Mahasiswa ke-"
                            .concat(String.valueOf(i + 1))
                            .concat(" : ")
            );
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        for (int nilai : nilaiMahasiswa){
            total += nilai;
        }

        double hasil = total / nilaiMahasiswa.length;
        System.out.printf("Maka, rata-rata Nilainya adalah %.1f", + hasil);
    }
}
