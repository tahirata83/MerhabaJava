package lessons.gun7;

public class StringIndexOf {
    public static void main(String[] args) {

               //01234567891011121314151617181920
     String str="Ben Java ogreniyorum";
        System.out.println(str.indexOf("B"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("n"));
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("ogr")); //9
        System.out.println(str.indexOf("Java ogreniyorum")); // 4
        System.out.println(str.indexOf("Ben Java ogreniyorum"));//0




    }
}
