package lessons.gun7;

public class StringTrim {
    public static void main(String[] args) {
        String s1="  Java";
        System.out.println(s1);
        System.out.println(s1.trim());
        System.out.println("========================================================");
        String s2="Java  ";
        String st="ne";
        System.out.println(s2+st);
        System.out.println(s2.trim()+st);
        System.out.println("===========================================================");
        String s3="    Java ogreniyorum";
        System.out.println(s3);
        System.out.println(s3.trim());
        System.out.println("=====================================================");
        String s4="   Ben Java Ogreniyorum   ";
        System.out.println(s4);
        System.out.println(s4.trim());
        System.out.println("=====================================================");
    }
}
