import java.lang.StringBuilder;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Target Saldo Tabungan
 *
 */

public class Latihan20TargetTabungan {

    public static void main(String[] args){

        int saldoAwal = 3500000, tabungan = 0;
        double bungaBank = 0.08;

        do{
            tabungan += 1;
            saldoAwal += saldoAwal * bungaBank;
            System.out.println ("Saldo di bulan ke-" + tabungan + " Rp." +saldoAwal);
        } while (saldoAwal < 6000000);


    }

}
