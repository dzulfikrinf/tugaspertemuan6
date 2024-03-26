package tugaspertemuan6;

public class segitiga {
    double alas;
    double tinggi;
    double sisi;
    
    segitiga(){
        alas = 1;
        tinggi = 1;
        sisi = 1;
    }
    segitiga(double newAlas, double newTinggi, double newSisi){
        alas = newAlas;
        tinggi = newTinggi;
        sisi = newSisi;
    }
    
    void setAlas(double newAlas){
        alas = newAlas;
    }
    
    void setTinggi(double newTinggi){
        tinggi = newTinggi;
    }
    
    void setSisi(double newSisi){
        sisi = newSisi;
    }
    
    double getKeliling(){
        return sisi * 3;
    }
    
    double getLuas(){
        return (alas * tinggi)/2;
    }
}
