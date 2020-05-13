package lessons.gun7;

public class StringUpperCaseLowerCase {
    public static void main(String[] args) {

        String s1="java ogreniyorum";
        System.out.println(s1.toUpperCase());
        System.out.println("=========================================================");

        String s2="JAVA";
        System.out.println(s2.toLowerCase());

        System.out.println("=========================================================");

        String s3="Merhaba Java";
        System.out.println(s3.toUpperCase());

        System.out.println("=========================================================");

        String s4="Merhaba Java";
        System.out.println(s4.toLowerCase());

        String s5="merhaba ";
        String s6="java";
        String s7=s5.toUpperCase();
        String s8=s6.toUpperCase();
        System.out.println(s7.concat(s8));
        System.out.println(s5.toUpperCase()+s6.toUpperCase());


    }

}
