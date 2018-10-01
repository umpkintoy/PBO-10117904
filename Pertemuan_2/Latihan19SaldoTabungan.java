import java.lang.StringBuilder;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Saldo Tabungan
 *
 */

public class Latihan19SaldoTabungan {

    public static void main(String[] args){

        int saldoAwal = 2500000, bulan = 6;
        double bungaBank = 0.15;

        for (int i = 1; i<=bulan; i++){
            saldoAwal += saldoAwal * bungaBank;
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldoAwal);
        }

    }

}
