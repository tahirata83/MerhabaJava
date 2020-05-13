package lessons.gun7;

public class StringLength {
    public static void main(String[] args) {
        String str = "Ben Java ogreniyorum";
        System.out.println(str.length());
        String s1 = "Java ogrenmem icin cok pratik yapmam lazim";
        System.out.println("=============================================");
        String s2 = "Biz su an Stringleri ogreniyoruz";
        System.out.println(s2.length());
        System.out.println(s2.length() < 10);
        System.out.println(s2.length() > 10);
        System.out.println("===============================================");

        if (s2.length() < 10) {  // eger if icerisindeki condition dogru ise output calisacak.degilse calismayacak
            System.out.println("evet dogru");
        }




    }
}
