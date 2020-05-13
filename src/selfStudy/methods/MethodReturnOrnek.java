package selfStudy.methods;

public class MethodReturnOrnek {

    public static int ikiIleCarp(int a){
        return a*2;
    }

    public static int ikiIleTopla(int a){
        return a+2;
    }

    public static int dortIleCarp(int a){
        return a*4;
    }

    public  static int deneme(int a){
        System.out.println("cikti veriliyor...");
        return  a*2;
       // System.out.println("cikti veriliyor...");     returndan sonra kod calismaz
    }



    public static void main(String[] args) {


        System.out.println("Sonuc = " + dortIleCarp(ikiIleTopla(ikiIleCarp(8))));

        // return sonra gelen hicbir kod calismaz
        deneme(5);
        System.out.println(deneme(5));

    }
}
