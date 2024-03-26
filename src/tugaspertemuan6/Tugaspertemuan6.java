package tugaspertemuan6;

public class Tugaspertemuan6 {

    public static void main(String[] args) {
        segitiga segitiga1 = new segitiga();
        System.out.println("Keliling segitiga dengan sisi " + segitiga1.sisi + 
                " adalah " + segitiga1.getKeliling());
        System.out.println("Luas segitiga dengan alas " + segitiga1.alas + 
                " dan tinggi " + segitiga1.tinggi + " adalah " +
                segitiga1.getLuas());
        
        System.out.println("\n");
        
        segitiga segitiga2 = new segitiga(30, 10, 90);
        System.out.println("Keliling segitiga dengan sisi " + segitiga2.sisi + 
                " adalah " + segitiga2.getKeliling());
        System.out.println("Luas segitiga dengan alas " + segitiga2.alas + 
                " dan tinggi " + segitiga2.tinggi + " adalah " +
                segitiga2.getLuas());
        
        System.out.println("\n");
        
        segitiga segitiga3 = new segitiga(20, 30, 60);
        System.out.println("Keliling segitiga dengan sisi " + segitiga3.sisi + 
                " adalah " + segitiga3.getKeliling());
        System.out.println("Luas segitiga dengan alas " + segitiga3.alas + 
                " dan tinggi " + segitiga3.tinggi + " adalah " +
                segitiga3.getLuas());
    }
    
}
