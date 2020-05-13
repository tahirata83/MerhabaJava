package lessons.gun7;

public class StringConcat {
    public static void main(String[] args) {

        String ad="Tahir ";
        String soyadi="Atayev";
        System.out.println(ad+soyadi);

        System.out.println("concatenation metodu============================================================");
        //  concatenation--  baglamak

        System.out.println(ad.concat(soyadi));  // System.out.println(ad+soyadi);

        System.out.println("concatenation ornek 1 =============================================");


        System.out.println("Ben java ".concat("ogreniyorum ")); // Ben java ogreniyorum







        // Merhaba Java

        String s1="Merhaba ";
        String s2="Java ";
        System.out.println(s1.concat(s2));

        System.out.println("concatenation ornek 2 =============================================");

        String s3="Merhaba ";
        String s4="Java";
        String s5= ".";

        String sb=s3.concat(s4);
        System.out.println(sb.concat(s5));
        System.out.println((s3.concat(s4)).concat(s5));










//        String ad="Tahir";
//        String soyadi="Atayev";
//        System.out.println(ad+" "+soyadi);
//        System.out.println(ad.concat(soyadi));
//
//        /*
//        \'--------- ' tek tirnak
//        \ " -------- " cift tirnak     "ben \'JAva\' ogreniyorum"
//        \\ ===========  \ backslash

        System.out.println("ben \\JAva\\ ogreniyorum");

   //      */



    }

}
