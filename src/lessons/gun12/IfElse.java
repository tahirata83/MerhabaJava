package lessons.gun12;

public class IfElse {
    public static void main(String[] args) {
        int a=3;

        if (a>0){
            System.out.println("sayi sifirdan buyuktur");
        }else{
            System.out.println("Sayi sifirdan kucuktur");
        }

        System.out.println("==================================================================================");

        String s1="Benim";
        String s2="Sen";
        if(s1.length()==s2.length()){
            System.out.println("kelime karakterlerinin sayisi esittir");
        }else{
            System.out.println("kelime karakterlerinin sayisi  esit degildir");
        }
    }
}
