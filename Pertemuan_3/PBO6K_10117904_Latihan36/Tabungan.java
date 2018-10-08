package PBO6K_10117904_Latihan36;
/**
 *
 * @author
 * NAMA : Siti Safira Nadifa
 * KELAS : PBO-6K
 * NIM : 10117904
 * Deskripsi Program : Program tabungan
 *
 */
public class Tabungan {

    private static final double potBunga = 0.08;

    private double saldoAwal = 3500000.0;
    private double saldoTarget = 6000000.0;
    private int lamaBulan = 0;

    private void menabung() {
        saldoAwal += saldoAwal * potBunga;
        lamaBulan += 1;
    }

    public void printTargetSaldo(){
        do{
            menabung();
            System.out.printf(
                    "Saldo di bulan ke-"
                            .concat(String.valueOf(lamaBulan))
                            .concat(" Rp.")
                            .concat(String.valueOf("%,d\r\n")),
                    (int) saldoAwal);
        } while(saldoAwal < saldoTarget);
    }

}
