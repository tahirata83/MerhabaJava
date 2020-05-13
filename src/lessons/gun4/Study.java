package lessons.gun4;

public class Study {
    public static void main(String[] args) {














        int a=5;
        int maxInt=2147483647;
       if(a>10){
           System.out.println("ok");
       }else {
           System.out.println("not ok");
       }




        int numA = 2;
        int numB = 1;
        System.out.println(numA * numB);
        numB = numB + 1;
        System.out.println(numA * numB);
        numB = numB + 1;
        System.out.println(numA * numB);

        //run ile debug farki



       /*
            primitive tipler hafizada  belirtildigi alan kadar yer kaplar.

         Tam Sayilar: byte-short-int-long
         ondalik sayilar: float- double
         tek karakter; char(%, &,a,b,9)
         boolen: true,false
         */
            byte b=1;
            short s=-3;
            int i=134;
            long l= -223;

            float f = 4.3f;
            double d= -4.6;


        /*
                                  -- BYTE--
        byte---> hafizada 8 bit lik bir alan kapsar. -128 ile +128 arasinda tam sayi degeri alir
        (byte hafizada 1 de girsen 100 de girsen 8 bit lik alan tutar)
        */
        byte bSayi=-127;



        /*
        `                           --SHORT--
    short---> hafizada 16 bit lik bir alan kapsar. -2^15 ile +2^15 arasinda tam sayi degeri alir
        (short hafizada 1 de girsen 100 de girsen 16 bit lik alan tutar)

        */

        short sSayi=345;
        short sSayi1=1;


         byte b1=8;
         int i1=8;
         short s1=8;
         long l1=8;
         long l3= 1100000000L;
         int i5= 2100000000;
        // long>int>short>byte

        /*
                                --INT--
    int---> hafizada 32 bit lik bir alan kapsar. -2^31 ile +2^31 arasinda tam sayi degeri alir
        (int hafizada 1 de girsen 100 de girsen 32 bit lik alan tutar)

        */
        int iSayi=3405;


         /*
                                --LONG--
    long---> hafizada 64 bit lik bir alan kapsar. -2^63 ile +2^63 arasinda tam sayi degeri alir
        (long hafizada 1 de girsen 100 de girsen 64 bit lik alan tutar)

        */
        long lSayi=3405;

         /*
                                --FlOAT--
    float---> hafizada 32 bit lik bir alan kapsar. virgulden sonrs 7 basamak alir. 10^-46 ile 10^38 arasinda ondalik sayi degeri alir
        (float hafizada 1 de girsen 100 de girsen 32 bit lik alan tutar)

        */

       float fSayi= 123.1555875f;


        /*
                                    --DOUBLE--
        double---> hafizada 64 bit lik bir alan kapsar. virgulden sonrs 14 basamak alir. 10^-324 ile 10^308 arasinda ondalik sayi degeri alir
                (double hafizada 1 de girsen 100 de girsen 64 bit lik alan tutar)

        */

        double dSayi= 23.734;



       /*
                                    --BOOLEAN--
        boolean--->Sadece true ve false degerini alir

        */

        boolean bDurum1=true;
        boolean bDurum2=false;



    }

}
