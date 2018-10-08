package PBO6K_10117904_Latihan33;
/**
 *
 * @author
 * NAMA : Siti Safira Nadifa
 * KELAS : PBO-6K
 * NIM : 10117904
 * Deskripsi Program : Program user login
 *
 */

public class User {
    private static final String USERNAME = "RizkiAdam";
    private static final String PASSWORD = "terbaikselalu";
    private boolean statusAkun;

    public void pengecekanLogin(String parUsername, String parPassword){
        hasilLogin(cekAkun(parUsername, parPassword), parUsername);
    }

    private boolean cekAkun(String parUsername, String parPassword){
        return USERNAME.equals(parUsername) && PASSWORD.equals(parPassword);
    }

    private void hasilLogin(boolean status, String username){
        System.out.println();
        if (status) {
            System.out.println(("*******HALLO " .concat(username).concat("*******")).toUpperCase());
            System.out.println("Selamat datang di aplikasi ini");
        } else {
            System.out.println("Oooops, Username atau password anda salah");
        }
    }
}
