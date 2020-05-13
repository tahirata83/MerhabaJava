package selfStudy.methods;

public class SkorHesaplaMetodu {

    public static void skorHesapla(String isim,int puan){
        System.out.println(isim+" adli oyuncunun "+puan+ " puani var.");
    }

    public static void skorHesapla(int puan){
        System.out.println(" Isimsiz oyuncunun "+puan+ " puani var.");
    }

    public static void skorHesapla(String isim){
        System.out.println(isim+" adli oyuncunun hic puani yok.");
    }
    public static void main(String[] args) {

        skorHesapla("Tahir",300);
        skorHesapla("Ata");
        skorHesapla(200);
    }
}
