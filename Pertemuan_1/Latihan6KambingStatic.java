/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Static dan Constanta"
 *
 */

public class Latihan6KambingStatic {

    //nama pemilik kambing
    public static final String goat_owner = "JAGOAN";

    public static void main(String[] args) {
        Mamalia.currentKambing = 130818;
        System.out.printf("%s memiliki kambing sebanyak %d\r\n", goat_owner, Mamalia.currentKambing);

    }
}

class Mamalia {
    public static int currentKambing;
}


