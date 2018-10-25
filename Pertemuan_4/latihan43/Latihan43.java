package latihan43;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Siti Safira Nadifa
 * KELAS    : PBO6K
 * NIM      : 10117904
 * Penjelasan Program : Program gaji pegawai
 * 
 */

public class Latihan43 {

    public static void main(String[] args) {
        Scanner namaScanner = new Scanner(System.in);
        Scanner angkaScanner = new Scanner(System.in);
        GajiPegawai gaji = new GajiPegawai();
                               
        System.out.print("Nama\t\t: ");gaji.setNama(namaScanner.nextLine());
        System.out.print("Alamat\t\t: ");gaji.setAlamat(namaScanner.nextLine());
        System.out.print("Uang Transport\t: ");gaji.setUangTransport(angkaScanner.nextInt());
        System.out.print("Uang Tunjangan\t: ");gaji.setUangTunjangan(angkaScanner.nextInt());
        System.out.print("Gaji Pokok\t: ");gaji.setGajiPokok(angkaScanner.nextInt());
        
        gaji.setTotalGaji(gaji.totalGaji(gaji.getUangTunjangan(), 
                gaji.getUangTransport(), gaji.getGajiPokok()));
        System.out.println("");
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTunjangan(), 
                gaji.getUangTransport(), gaji.getGajiPokok(), gaji.getTotalGaji());
    }
    
}
