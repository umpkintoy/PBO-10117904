package latihan42;

public class Tabungan {
    
    private int saldo;

    public Tabungan(int saldo)
    {
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah)
    {
        return this.saldo - jumlah;
    }
}
