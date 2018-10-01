/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Introduce data type on Java Program
 *
 */

public class Latihan2Variable {

    public static void main(String[] args) {

        //Declaration of variable
        int valueInt;
        final double PHI = 3.14;
        boolean valueLogic;
        char valueChar;

        //Input value on variable
        valueInt = 78;
        valueLogic = false;
        valueChar = 'A';

        //Output
        System.out.println();
        System.out.printf("Isi variable nilai\t\t: %d\r\n", valueInt);
        System.out.printf("Isi variable PHI\t\t: %f\r\n", PHI);
        System.out.printf("Isi variable logika\t\t: %b\r\n", valueLogic);
        System.out.printf("Isi variable karakter\t: %s\r\n", valueChar);

    }
}
