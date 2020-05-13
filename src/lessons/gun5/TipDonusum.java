package lessons.gun5;

public class TipDonusum {
    public static void main(String[] args) {
        // byte-->short-->int-->long
        // Eger siz iki farkli veri tipi girerseniz Java otomatik daha kapsamli veri tipine kabul eder.

       byte bSayi=13;
       int iSayi=(int)bSayi;
        System.out.println(iSayi);

        System.out.println("int sayimiz "+iSayi);

        System.out.println("=======================================================================================");

        float fSayi=55.223f;
        int iSayi1= (int) fSayi;
        System.out.println("int sayimiz "+iSayi1);

        System.out.println("=======================================================================================");

        int sayi=25;
        System.out.println("int Sayimiz "+ sayi);

        double dSayi= (double)sayi;
        System.out.println("double sayimiz "+dSayi);

        System.out.println("=======================================================================================");


        double d=30.7;
        int i=(int)d;
        System.out.println(i);

        int i1= 7829;
        double d1=(double)i1;
        System.out.println(d1);


    }
}
