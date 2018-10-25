package latihan47;

public class Nilai {
    
    private double quiz;
    private double uts;
    private double uas;
    private double nilaiAkhir;       
    private char index;
    private String keterangan;

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double getNilaiAkhir(){
        this.nilaiAkhir = (0.2 * this.quiz) + (0.3 * this.uts) + (0.5 * this.uas);
        return nilaiAkhir;
    }

    public char getIndex() {
        return index;
    }

    public String getKeterangan() {
        return keterangan;
    }
 
    public char tentukanIndex(double nilaiAkhir){
        this.index = ' ';
        if (nilaiAkhir <= 100 && nilaiAkhir >= 80){
            this.index = 'A';
        } else if (nilaiAkhir >= 68){
            this.index = 'B';            
        } else if (nilaiAkhir >= 56){
            this.index = 'C';            
        } else if (nilaiAkhir >= 45){
            this.index = 'D';
        } else if (nilaiAkhir >= 0){
            this.index = 'E';            
        } else {
            this.index = '-';            
        }
        return this.index;
    }
    
    public String tentukanKeterangan(char index){        
        switch(index){
            case 'A':
                this.keterangan = "Sangat Baik";
                break;
            case 'B':                
                this.keterangan = "Baik";
                break;
            case 'C':                
                this.keterangan = "Cukup";
                break;
            case 'D':               
                this.keterangan = "Kurang";
                break;
            case 'E':
                this.keterangan = "Sangat Kurang";
                break;
            default:                
                this.keterangan = "Invalid Input";
                break;
        }
        return this.keterangan;
    } 
}
