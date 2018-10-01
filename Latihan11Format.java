/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Formatting in Java
 *
 */

public class Latihan11Format {

    public static void main(String[] args) {

        int v = 1213998;
        int vMinus = -v;

        System.out.printf("value: %d\r\n", v);
        System.out.printf("%%d: %d\r\n", v);
        System.out.printf("%%10d: %10d\r\n", v);
        System.out.printf("%%+10d: %+10d\r\n", v);
        System.out.printf("%%+10d: %+10d\r\n", vMinus);
        System.out.printf("%%,10d: %,10d\r\n", v);
        System.out.printf("%%-10d: %-10d\r\n", v);

        double vDouble = 12131998.123;

        System.out.printf("valueDouble: %f\r\n", vDouble);
        System.out.printf("%%f: %f\r\n", vDouble);
        System.out.printf("%%.2f: %.2f\r\n", vDouble);
        System.out.printf("%%12.2f: %12.2f\r\n", vDouble);
        System.out.printf("%%,12.2f: %,12.2f\r\n", vDouble);

    }

}
