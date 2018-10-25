package latihan44;

public class Baterai {
    
    private float kuatArus;
    private float hambatan;

    public Baterai() {
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitunganTegangan(){
    return kuatArus * hambatan;
    }
    
}
