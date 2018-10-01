import java.text.SimpleDateFormat;
import java.util.Date;
/*
 *
 * @author
 * NAMA 	: Siti Safira Nadifa
 * KELAS	: PBO6
 * NIM		: 10117904
 *
 * Description : Waktu sekarang
 *
 */

public class Latihan26Waktu {

    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMM yyyy hh:mm:ss");
        System.out.println("Waktu saat ini adalah " +sdf.format(new Date()));
    }

}
