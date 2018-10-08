/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : bit in Java
 *
 */

public class Latihan14Bit {

    public static void main(String[] args) {

        int A = 60; /* 0011 1100 */
        int B = 13; /* 0000 1101 */
        int C = 0;

        C = A & B;
        /* 12 = 0000 1100 */
        System.out.printf("a & b = %d\r\n", C);

        C = A | B;
        /* 61 = 0011 1101*/
        System.out.printf("a | b = %d\r\n", C);

        C = A ^ B;
        /* 49 = 0011 0001 */
        System.out.printf("a ^ b = %d\r\n", C);

        C = ~A;
        /* -61 = 1100 0011 */
        System.out.printf("~a = %d\r\n", C);

        C = A << 2;
        /* 240 = 1111 0000 */
        System.out.printf("a << 2 = %d\r\n", C);

        C = A >> 2;
        /* 15 = 0000 1111 */
        System.out.printf("a >> 2 = %d\r\n", C);

    }

}
