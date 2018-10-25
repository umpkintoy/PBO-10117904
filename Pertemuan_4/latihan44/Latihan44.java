package latihan44;

/**
 *
 * @author 
 * NAMA     : Siti Safira Nadifa
 * KELAS    : PBO6K
 * NIM      : 10117904
 * Penjelasan Program : Program menghitung hukum OHM
 * 
 */

public class Latihan44 {

    public static void main(String[] args) {
        
        System.out.println("=====Hukum Ohm=====");
        System.out.println(
            "Kuat arus yang mengalir pada suatu kawat penghantar\n" + 
            "akan berbanding lurus dengan beda potensial\n" + 
            "pada ujung - ujung kawat penghantar tersebut\n" + 
            "asalkan suhu kawat dijaga konstan.\n");

        Baterai baterai = new Baterai(3f, 12f);

        System.out.printf("Kuat Arus\t : %.1f Ampere\n", baterai.getKuatArus());
        System.out.printf("Hambatan\t : %.1f Ohm\n", baterai.getHambatan());
        System.out.printf("Hasil Tengangan\t : %.1f Volt\n", 
                baterai.hitunganTegangan());
    }  
}
