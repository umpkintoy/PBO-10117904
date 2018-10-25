package latihan46;

public class Age {
    
    private int yearBirth, yearNow;
    private final static String RED = "\033[0;31m";

    public Age(int yearNow) 
    {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur()
    {
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur)
    {
        if (0 <= umur && umur <= 5)
            return "LAGI LUCU-LUCU NYA";

        if (5 < umur && umur <= 10)
            return "MASIH ANAK ANAK";
        
        if (10 < umur && umur <= 13)
            return "MASIH REMADJA";

        if (13 < umur && umur <= 19)
            return "ALAY";

        if (19 < umur && umur <= 29)
            return "LAGI GALAU NYARI JODOH";

        if (29 < umur && umur <= 35)
            return "LAGI SIBUK NYARI UANG";

        if (35 < umur && umur <= 150)
            return "SUDAH TUA";

        return "KEMBALI KEPADA YANG MAHA KUASA";
    }
    
}
