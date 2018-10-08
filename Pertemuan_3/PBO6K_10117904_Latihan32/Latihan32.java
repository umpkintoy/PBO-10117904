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
public class Latihan32 {
    public static void main (String[] args) {
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println("\n");

        Film filmpertama = new Film();
        filmpertama.filmName = "Venom";
        filmpertama.filmGenre = "Action, Horror, Scifi";
        filmpertama.filmRating = 8.5;
        filmpertama.filmDuration = 120;
        filmpertama.tayangFilm();
        System.out.println("");

        Film filmkedua = new Film();
        filmkedua.filmName = "Small Foot";
        filmkedua.filmGenre = "Animation";
        filmkedua.filmRating = 9;
        filmkedua.filmDuration = 96;
        filmkedua.tayangFilm();
        System.out.println("");

        Film filmketiga = new Film();
        filmketiga.filmName = "Crazy Rich Asian";
        filmketiga.filmGenre = "Comedy";
        filmketiga.filmRating = 7.8;
        filmketiga.filmDuration = 119;
        filmketiga.tayangFilm();
        System.out.println("");

        Film filmkeempat = new Film();
        filmkeempat.filmName = "Asih";
        filmkeempat.filmGenre = "Horror";
        filmkeempat.filmRating = 6;
        filmkeempat.filmDuration = 100;
        filmkeempat.tayangFilm();
        System.out.println("");
    }
}
