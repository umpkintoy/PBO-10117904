package PBO6K_10117904_Latihan32;
/**
 *
 * @author
 * NAMA : Siti Safira Nadifa
 * KELAS : PBO-6K
 * NIM : 10117904
 * Deskripsi Program : Program menampilkan daftar film yang sedang ditayangkan
 *
 */
public class Film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;

    public void tayangFilm(){
        System.out.println("Judul Film\t: ".concat(filmName));
        System.out.println("Genre Film\t: ".concat(filmGenre));
        System.out.println("Rating Film\t: ".concat(String.valueOf(filmRating)));
        System.out.println("Duration Film\t: ".concat(String.valueOf(filmDuration)).concat(" Menit"));
    }
}
