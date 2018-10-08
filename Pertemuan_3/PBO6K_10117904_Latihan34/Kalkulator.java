package PBO6K_10117904_Latihan34;
/**
 *
 * @author
 * NAMA : Siti Safira Nadifa
 * KELAS : PBO-6K
 * NIM : 10117904
 * Deskripsi Program : Program kalkulator
 *
 */

public class Kalkulator {

    public double value1;
    public double value2;

    public Kalkulator(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }


    public void tambahBilangan(){
        System.out.println("Hasil Pertambahan\t: ".concat(String.valueOf(value1 + value2)));
    }

    public void kurangBilangan(){
        System.out.println("Hasil Perkurangan\t: ".concat(String.valueOf(value1 - value2)));
    }

    public void kaliBilangan(){
        System.out.println("Hasil Perkalian\t\t: ".concat(String.valueOf(value1 * value2)));
    }

    public void bagiBilangan(){
        System.out.println("Hasil Pembagian\t\t: ".concat(String.valueOf(value1 / value2)));
    }

    public void sisaBilangan(){
        System.out.println("Hasil Sisa\t\t: ".concat(String.valueOf(value1 % value2)));
    }
}
