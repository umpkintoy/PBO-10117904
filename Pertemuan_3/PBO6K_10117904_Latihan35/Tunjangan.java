package PBO6K_10117904_Latihan35;
/**
 *
 * @author
 * NAMA : Siti Safira Nadifa
 * KELAS : PBO-6K
 * NIM : 10117904
 * Deskripsi Program : Program tunjangan gaji
 *
 */
public class Tunjangan {
    public double tunjangan;
    public double totalGaji;

    public void hasilTunjangan(Double gajiPokok, String status) {
        System.out.println("=========Hasil Perhitungan Gaji==========");
        System.out.println("Gaji Pokok/t/t: " + gajiPokok);

        tunjangan = (status.equalsIgnoreCase("Menikah")) ? 0.35 * gajiPokok : 0;
        System.out.println("Tunjangan : Rp. " + tunjangan);


        totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Gaji : Rp. " + totalGaji);
    }
}
