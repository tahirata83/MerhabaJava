package lessons.gun5;

public class stringSayiDonusumu {
    public static void main(String[] args) {

          //    default value bahset;

        String s=null;
        int a=0;
        short sh =0;
        long lg=0;
        byte b;


        //bayt=8 bit
        String sayi1="10";
        String sayi2="42";

        String toplam1= sayi1+sayi2;

        System.out.println(toplam1);
        String s9="one";
      //  int dd=Integer.parseInt(s9);


        System.out.println("============================================================================");

        int iSayi1=Integer.parseInt(sayi1);
        int iSayi2=Integer.parseInt(sayi2);

        int intToplam1=iSayi1+iSayi2;

        System.out.println(intToplam1);

        System.out.println("============================================================================");

        String  sayi3="10";    double sayi5=Double.valueOf(sayi3);
        String  sayi4="20";

        String toplam2=sayi3+sayi4;

        System.out.println(toplam2);

        int iSayi3=Integer.valueOf(sayi3);
        int iSayi4=Integer.valueOf(sayi4);

        int intToplam2=iSayi3+iSayi4;

        System.out.println(intToplam2);

        // intToplam1= iSayi3+iSayi4;
        // System.out.println(intToplam1);
        System.out.println("============================================================================");

        int iSayi5=23;
        String iSayi6="24";
        String iSayi7="25";

        float fSayi1=Float.valueOf(iSayi5);
        System.out.println(fSayi1);

        float fSayi2=Float.parseFloat(iSayi6);
        System.out.println(fSayi2);

        float fSayi3=Float.valueOf(iSayi7);
        System.out.println(fSayi3);

        System.out.println("============================================================================");

        
    }
}
