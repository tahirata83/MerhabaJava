package lessons.gun8;

public class StringSubstring {
    public static void main(String[] args) {
                 //012345678910
        String s1="Hello World";
        System.out.println(s1.substring(5,10));// Worl
        System.out.println(s1.substring(2,4));//   ll
        System.out.println(s1.substring(7,10));  // orl
        System.out.println(s1.substring(4)); //o World
        System.out.println("ornek 1 ve cozumler============================");
       //  el,lo W,ld,H,W,d
        System.out.println(s1.substring(1,3));
        System.out.println(s1.substring(3,6));
        System.out.println(s1.substring(6,7));
        System.out.println(s1.substring(9,11));
        System.out.println(s1.substring(0,1));
        System.out.println(s1.substring(6,7));
        System.out.println(s1.substring(10,11));

        System.out.println("ornek 2 ve cozumler============================");



        String s2="Benim ismim Tahir";// Benim ismim Tahyr
        char[] ch = s2.toCharArray();

        ch[ch.length - 2] = 'y';

        String result = "";

        for (int i = 0; i < ch.length; i++) {
            result += ch[i];
        }

        System.out.println(result);




        System.out.println(s2.replace(s2.substring(15,16),"y"));
                                            //




        System.out.println("ornek 3 ve cozumler============================");
        String s3="Ben";// en
        System.out.println(s3.substring(1));

        String s4="Java";// va
        System.out.println(s4.substring(2));
        String s5="Ogreniyorum";// orum
        System.out.println(s5.substring(7));

        String s6="Ogreniyorum";// eniy
        System.out.println(s6.substring(3,7));




    }
}
