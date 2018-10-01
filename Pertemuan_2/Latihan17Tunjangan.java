import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Program Tunjangan Gaji
 *
 */

public class Latihan17Tunjangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gaji;
        boolean nikah = false;

        System.out.println("============= Program Tunjangan =============");
        System.out.print("Berapa gaji pokok anda perbulan?\t: ");
        gaji = Double.parseDouble(scanner.nextLine());
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        nikah = (scanner.nextLine()).equalsIgnoreCase("Menikah");


        System.out.println("\n\n======= Hasil Penghitungan Gaji Anda ========");
        System.out.println("Gaji Pokok\t\t\t: Rp ".concat(String.valueOf(gaji)));
        System.out.println("Tunjangan\t\t\t: Rp ".concat(String.valueOf(gaji * (nikah ? 0.35 : 0))));
        System.out.println("Total Gaji\t\t\t: Rp ".concat(String.valueOf(gaji + (gaji * (nikah ? 0.35 : 0)))));
        System.out.println("\n\n");
    }
}
