import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Nilai terbesar dan terkecil
 *
 */
public class Latihan23Nilai {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String namaPetugas = "";
        int jumlahMahasiswa = 0, index;
        int[] nilaiMahasiswa;

        System.out.println("\n==== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa ====\n\n");
        System.out.print("Masukan Nama Petugas\t\t\t: ");
        namaPetugas = scanner.nextLine();

        System.out.print("Masukan Banyaknya Nilai Mahasiswa\t: ");
        jumlahMahasiswa = scanner.nextInt();
        nilaiMahasiswa = new int[jumlahMahasiswa];
        System.out.println();


        for (index = 0; index < jumlahMahasiswa; index++){
            System.out.print("Masukan Nilai Mahasiswa ke-".concat(String.valueOf(index+1)).concat(" = "));
            nilaiMahasiswa[index] = scanner.nextInt();
        }


        System.out.println("\n=================== Hasil Nilai Mahasiswa ===================\n\n");
        index = 0;
        for(int nilai : nilaiMahasiswa){
            System.out.println("Nilai Mahasiswa ke-".concat(String.valueOf(nilai+1)).concat(" = ").concat(String.valueOf(nilai)));
            nilai+=1;
        }

        System.out.println("\n");
        System.out.println("Nilai Terbesar adalah ".concat(String.valueOf(getMaxOrMinValue(nilaiMahasiswa, true))));
        System.out.println("Nilai Terkecil adalah ".concat(String.valueOf(getMaxOrMinValue(nilaiMahasiswa, false))));

        System.out.println("\n");
        System.out.println("Nama Petugas : ".concat(namaPetugas));

    }


    public static int getMaxOrMinValue(int[] value, boolean isMax){
        int temp = 0;
        if (value.length != 0){
            temp = value[0];
            for(int datum : value){
                if(isMax){
                    temp = datum > temp ? datum : temp;
                } else {
                    temp = datum < temp ? datum : temp;
                }
            }
            return temp;
        } else {
            return 0;
        }
    }

}
