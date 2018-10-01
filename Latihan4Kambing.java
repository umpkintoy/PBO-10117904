/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Count and output the number of "kambing"
 *
 */

public class Latihan4Kambing {

    public void addKambing() {
        int currentKambing = 0;

        currentKambing = currentKambing + 5;

        System.out.printf("Jumlah Kambing setelah ditambah: %d\r\n", currentKambing);
    }

    public static void main(String[] args) {
        Latihan4Kambing kambing = new Latihan4Kambing();
        kambing.addKambing();

    }

}
