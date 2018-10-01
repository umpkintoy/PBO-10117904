import java.util.Scanner;
import java.util.InputMismatchException;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Perhitungan Lingkaran
 *
 */
public class Latihan22HitungLingkaran {

    private static final double PHI = 3.14159;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int diameter = 0;
        boolean input = false;

        System.out.println("\n=========== Perhitungan Lingkaran ===========");

        do {
            try {
                System.out.print("\nMasukan Nilai diameter Lingkaran : ");
                diameter = scanner.nextInt();
                input = true;
            } catch (InputMismatchException e) {
                System.out.println("Nilai Diameter tidak sesuai\n");
                scanner = new Scanner(System.in);
            }
        } while (!input);

        System.out.println("\n======= Hasil Perhitungan Lingkaran =========");
        System.out.println("Jari jari Lingkaran\t: ".concat(String.valueOf(diameter / 2)));
        System.out.printf("Luas Lingkaran\t\t: %.2f\n", calculateCircleLarge(diameter / 2));
        System.out.printf("Keliling Lingkaran\t: %.2f\n", calculateCircleSurfaceArea(diameter));
    }


    public static double calculateCircleSurfaceArea(int diameter){
        return PHI * diameter;
    }

    public static double calculateCircleLarge(int radius){
        return PHI * (radius * radius);
    }
}
