package latihan41;

/**
 *
 * @author Siti Safira Nadifa
 */
public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(){
        return sisi * sisi * sisi;
    }
    
    public int hitungMassa(){
        return massa / hitungVolume();
    }
    
}
