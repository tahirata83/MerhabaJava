package lessons.gun3;

import lessons.gun1.Asa;

public class Sayilar {
    public static void main(String[] args) {
        Asa as=new Asa();

      int a=5;
      int b =4;
      int c=6;
      double d=2.5;

      int toplam=a+b+c;
      int cikart= a-b;
      int carpma= a*b;
      int bolme=a/b;



        System.out.println("  TOPLAM------------------------------------------------");
        System.out.println(a+b);
        System.out.println("iki sayinin toplami "+toplam);



        System.out.println("  CIKARTMA------------------------------------------------");

        System.out.println("Iki sayinin farki "+cikart);

        System.out.println("CARPMA----------------------------------------");

        System.out.println("Iki sayinin carpimi "+carpma);


        System.out.println("BOLME----------------------------------------");
        System.out.println("Iki sayinin bolumu "+bolme);


        /* ornek 1--- Kenarlari 3  ve 5 olan dikdortgenin cevresini ve alanini hesaplayin.

        Alan=kenar1*kenar2
        Cevre= 2(kenar1+kenar2)
*/
        System.out.println("Ornek 1 cozumu:---------------------------------------------------");
                int kenar1=3;
                int kenar2=5;
                int alan=kenar1*kenar2;
                int cevre=2*(kenar1+kenar2);
        System.out.println("Diktortgen alani----->"+alan);
        System.out.println("Dikdortgen cevresi----->"+cevre);
        System.out.println("==================================================================");
/*




         ornek 2--- aile fertlerinin yaslari toplami ve farki
*/
        System.out.println("Ornek 2 cozumu:---------------------------------------------------");
        int baba= 35;
        int anne= 30;
        int cocuk1= 6;
        int cocuk2= 3;
        int cocuk3=1;
        int yasToplam=baba+anne+cocuk1+cocuk2+cocuk3;
        System.out.println(yasToplam);


        System.out.println("cevap-----------------------------------------------------------------");
        System.out.println("yaslari toplami " +baba+anne+cocuk1+cocuk2+cocuk3);
        System.out.println("yaslari toplami "+2*(kenar1+kenar2));


        int ebeveynYasFarki=baba-anne;
        System.out.println("Yas farki ------>"+ ebeveynYasFarki);



        /*

        odev

         ornek 3---- 32 ile 38 i toplayip 5 bolup 19 ekleyin

          */
         int i1=32;
         int i2=38;
         int i3=5;
        int i4=19;
        int sonuc=(i1+i2)/i3+i4;
      System.out.println(sonuc);
      System.out.println("ornek 3 cevabi ---->"+((32+38)/5+19));



/*
         ornek 4  --- 5 ile 6 nin karelerinin toplami nedir?
       */

      int i5=5;
      int i6=6;
      int sonuc1=i5*i5+i6*i6;
      System.out.println("ornek 4 cevabi ----->"+sonuc1);



    }
}
