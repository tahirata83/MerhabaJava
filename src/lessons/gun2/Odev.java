package lessons.gun2;

public class Odev {
    public static void main(String[] args) {



         /*
         - Gun2 package altinda Odev sinifi olusturup odevi oraya yapalim.
         - Odev


           -- Yazdirmamiz gereken cumlemiz ----    Bu gün Javada Stringleri öğrendik.

           1- Degisken kullanmadan normal bir sekilde yazdirin ======> Bu gün Javada Stringleri öğrendik.
           2-Degisken kullanmadan bitisik bir sekilde yazdiri   ======> BugünJavadaStringleriöğrendik.
           3- Degisken kullanarak  normal bir sekilde yazdirin ======> Bu gün Javada Stringleri öğrendik.
           4- Degisken kullanarak  bitisik bir sekilde yazdirin (Not:String str="BugünJavadaStringleriöğrendik." kullanma) ======> BugünJavadaStringleriöğrendik.

           5- Degisken kullanmadan  alt alta  olacak sekilde yazdirin ======> Bu
                                                                             gün
                                                                            Javada
                                                                            Stringleri
                                                                            öğrendik.

            6- Degisken kullanarak  alt alta  olacak sekilde yazdirin ======> Bu
                                                                             gün
                                                                            Javada
                                                                            Stringleri
                                                                            öğrendik
         */


        System.out.println("Cevap1---------------------------------------------------------------------------------------------");
        System.out.println("Bu gün Javada Stringleri öğrendik.");
        System.out.println("Cevap2---------------------------------------------------------------------------------------------");
        System.out.println("Bu"+"gün"+"Javada"+"Stringleri"+"öğrendik.");
        System.out.println("BugünJavadaStringleriöğrendik.");
        System.out.println("Cevap3---------------------------------------------------------------------------------------------");
        String str= "Bu gün Javada Stringleri öğrendik.";
        System.out.println(str);
        System.out.println("Cevap4----------------------------------------------------------------------");
        String str1="BugünJavadaStringleriöğrendik.";
        System.out.println(str1);
        String a="Bu ", b="gün " ,c="Javada" ,d="Stringleri ",e="öğrendik. ";

        System.out.println(a +     b     +    c +    d +   e);
        System.out.println("Cevap5----------------------------------------------------------------------");
        System.out.println("Bugün");
        System.out.println("Javada");
        System.out.println("Stringleri");
        System.out.println("öğrendik.");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Bugün"+"\n"+"Javada"+"\n"+"Stringleri"+"\n"+"öğrendik.");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Bu\ngün\nJavada\nStringleri\nöğrendik.");
        System.out.println("Cevap6----------------------------------------------------------------------");
        String kelime1="Ben";
        String kelime2="Java";
        String kelime3="Ogrenmeye";
        String kelime4="Basladim.";

        System.out.println(kelime1);
        System.out.println(kelime2);
        System.out.println(kelime3);
        System.out.println(kelime4);

        System.out.println(kelime1+"\n"+kelime2+"\n"+kelime3+"\n"+kelime4);




    }
}
