package lessons.gun10;

public class StringContains {

    public static void main(String[] args) {

    String str="Ben Java ogreniyorum";
        System.out.println(str.contains("J"));// true
        System.out.println(str.contains("Ben")); // true
        System.out.println(str.contains(" "));
        System.out.println(str.contains("  "));
        System.out.println(str.contains("e"));



        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));   // true
        System.out.println(myStr.contains("e"));     // true
        System.out.println(myStr.contains("Hi"));    // false
    }
}


