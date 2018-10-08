package PBO6K_10117904_Latihan31;
/**
 *
 * @author
 * NAMA : Siti Safira Nadifa
 * KELAS : PBO-6K
 * NIM : 10117904
 * Deskripsi Program : Program menampilkan perkenalan diri
 *
 */
public class Mahasiswa {
    public String name;
    public String nim;

    public void perkenalkanDiri(String name, String nim){
        System.out.println("Helo Everyone");
        System.out.println("My Nim is ".concat(nim));
        System.out.println("My Name is ".concat(name));
        System.out.println(" ");
    }
}
