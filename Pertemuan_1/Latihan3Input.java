import java.util.*;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Input data on Java Program
 *
 */

public class Latihan3Input {

    public static void main(String[] args) {

        System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        System.out.printf("Nama anda adalah : %s\r\n", name);
    }

}
