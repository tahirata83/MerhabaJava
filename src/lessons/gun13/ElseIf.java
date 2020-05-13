package lessons.gun13;

public class ElseIf {
    public static void main(String[] args) {

        int a = 4;

        if (a > 10) {
            System.out.println("sayi 10 dan buyuktur");
        } else if (a < 10) {
            System.out.println("sayi 10 dan kucuktur");
        } else {
            System.out.println("sayimiz 10 a esittir");
        }
        System.out.println("Ornek ==============================================================");

        String kelime = "merhaba";

        if (kelime == "P.tesi") {
            System.out.println("haftanin 1 .gunu");
        } else if (kelime == "Sali") {
            System.out.println("haftanin 2 .gunu");
        } else if (kelime == "Cars") {
            System.out.println("haftanin 3 .gunu");
        } else if (kelime == "Pers") {
            System.out.println("haftanin 4 .gunu");
        } else if (kelime == "Cuma") {
            System.out.println("haftanin 5 .gunu");
        } else if (kelime == "C.tesi") {
            System.out.println("haftanin 6 .gunu");
        } else if (kelime == "C.tesi") {
            System.out.println("haftanin 6 .gunu");
        }else{
                System.out.println("boyle bir gun yoktur");
            }
        }
    }