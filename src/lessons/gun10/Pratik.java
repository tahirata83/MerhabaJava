package lessons.gun10;

public class Pratik {
    public static void main(String[] args) {

        String str="GeeksforGeeks";

        // kac karakter var
        System.out.println(str.length());
        // 3. ve 8. nci indexte hangi karakterler var
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(8));
        // f karakterinin indexin bulun
        System.out.println(str.indexOf("f"));
        // Stringimiz ksf iceriyor mu?
        System.out.println(str.contains("ksf"));
        // Stringimiz eeeks iceriyormu
        System.out.println(str.contains("eeeks"));
        // stringimizin karakterleri hepsi buyuk olsun
        System.out.println(str.toUpperCase());
        // string karakterleri hepsi kucuk olsun
        System.out.println(str.toLowerCase());
        // o karakterini u karakterine cevirin
        System.out.println(str.replace("o","u"));
        // ee, ksf,Geeks, Ge , o print edin
        System.out.println(str.substring(1,3));
        System.out.println(str.substring(3,6));
        System.out.println(str.substring(8,13));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(8,10));
        System.out.println(str.substring(6,7));



        // icinde  tek e karakteri gecen bir String yazin. sonra string karakter sayisi ile e nin index toplamini bulun
        String s="Ben Okuyorum.";
        int lght=s.length();
        int idx=s.indexOf("e");
       int sum=lght+idx;
        System.out.println(sum);
        System.out.println(lght+idx);
        System.out.println(s.length()+s.indexOf("e"));
       //   ex: s1="100", s2="300" => toplam 400 vermeli
        String s1="100";
        String s2="300";
        int i1=Integer.valueOf(s1);
        int i2=Integer.valueOf(s2);
        System.out.println(i1+i2);

        System.out.println(s1+s2);      // bu kod ------> 100300 sunuc verir
      //   degerler = ["5", 50, 2.24, "22", 50000]; bu degerlerin ortalamasini bul
        String sSayi="5";       double d1=Double.valueOf(sSayi);
        Integer iSayi=50;       double d2=Double.valueOf(iSayi);
        Double dSayi=2.24;      double d3=Double.valueOf(dSayi);
        String s1Sayi="22";     double d4=Double.valueOf(s1Sayi);
        Integer i1Sayi=50000;   double d5=Double.valueOf(i1Sayi);

        double ortalama=(d1+d2+d3+d4+d5)/5;
        System.out.println(ortalama);
        System.out.println((d1+d2+d3+d4+d5)/5);


        double d=888.8;
        int w = (int)888.8;
                             byte x = (byte)100L;

       long y = (byte)100;
                byte z = (byte)100L;

    }


}
