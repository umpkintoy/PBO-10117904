package PBO6K_10117904_Latihan33;
/**
 *
 * @author
 * NAMA : Siti Safira Nadifa
 * KELAS : PBO-6K
 * NIM : 10117904
 * Deskripsi Program : Program user login
 *
 */

import java.util.Scanner;
public class Latihan33 {
    private static String usName;
    private static String passWord;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Username\t: ");
        usName = scanner.nextLine();

        System.out.print("Masukan Password\t: ");
        passWord = scanner.nextLine();

        User user = new User();
        user.pengecekanLogin(usName, passWord);
    }
}
