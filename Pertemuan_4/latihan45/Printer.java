package latihan45;

public class Printer {
    
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("");
        System.out.println("Nama anda\t : "+nama);
    }
    
    public void cetak(int jmlCetak, String nama){
        System.out.println("");
        for (int i = 0; i < jmlCetak; i++) {
            System.out.println((i + 1) + ". " +nama);
        }
    }
}
