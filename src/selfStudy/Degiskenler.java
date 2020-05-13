package selfStudy;

public class Degiskenler {
    public static void main(String[] args) {
        int a=4;
        int b;
        b=3;
        b++;

        int c=2+4;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("==================================================================");

   /*
     --  ilkel veri tipleri byte-->short-->int-->long

     --   1 byte=8 bit   bit 0 ya da 1 degerlerine sahip oluyor
     byte=b bit
     short=
     int=32 bit  // - 2^31 ve 2^31 araliginda
     float=32 bit
     double= 64 bit

     */
        System.out.println("=================================================================");
        byte b1=100;
        byte b2=(byte)(b1/2);
        System.out.println(b2);

        short s=100;
        byte b3=2;
        int i=4;
        long l= s+b3+i;
        System.out.println(l);
        System.out.println("==============================================================");

     //      int-->float--> double
        double d1=5.25;
        double d2=4.0;
        double d3=4d;
        double d4=4.23d;

        float f1=(float)5.0;
        float f2=5f;
        float f3=5.4f;

        int i2= 22/7;
        float f4=22f/7f;
        double d5=22d/7d;

        System.out.println("i2:"+i2);
        System.out.println("f4:"+f4);
        System.out.println("d5:"+d5);
        System.out.println("===================================================================");
    int i6=5;
    float f6=i6;
    double d6=f6;
        System.out.println(i6);
        System.out.println(f6);
        System.out.println(d6);

        long l7=564444354;
        float f7=l7;
        System.out.println("===================================================================");
        double sayi1=70.25;
        double sayi2=60d;
        double sayi3=80.2;
        System.out.println("ortalam "+(sayi1+sayi2+sayi3)/3);
        float sayi4=70.25f;
        float sayi5=60f;
        float sayi6=80.2f;
        System.out.println("ortalam "+(sayi4+sayi5+sayi6)/3);

        // char veri tipi:2 byte yer kaplar.2^16 tane karakter bicimlendirebilir


    }
}
