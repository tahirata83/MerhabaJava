package lessons.gun11;

public class IfConditition {
    public static void main(String[] args) {
        System.out.println("1.If blogu==============================================");
        if(2+3==5){
            System.out.println("condition dogru oldugu icin if blogu calisti");
        }
        System.out.println("2.If blogu==============================================");
        if(2+4==5){
            System.out.println("condition yanlis oldugu icin if blogu calismayacak");
            // condition yanlis oldugu icin if blogu calismayacak yani hicbirsey print etmeyecek
        }
        System.out.println("3.If blogu==============================================");



        System.out.println("ornek 1==================================================");
        int a=3;
        int b=7;
        int c=10;


        if (a>b){
            System.out.println("a buyukmus b den");
        }
        if (a<b){
            System.out.println("megersem b buyukmus a dan");
        }

        if (c>a){
            System.out.println("galiba c a dan da buyuk b den buyuk");
        }

        if(c>b){
            System.out.println("c en buyuk sayimi acaba");
        }


        System.out.println("ornek 2=================================================================================");

        int sayi= 10;

        if(true&&false){
            sayi++;
        }
        sayi--;
        System.out.println(sayi);

        System.out.println("ornek 3====================================================================");


         int sayi1= 39;
         int sayi2=32;
         int sayi3=39;


         // en buyuk sayiyi bulalim
        int max =sayi1;

        if (max<sayi2){
            max=sayi2;
        }

        if (max<sayi3){
            max=sayi3;
        }

        System.out.println("en buyuk sayimiz " + max);


        System.out.println("===================================");
        int i=4;
        i=5;
        i=6;
        i++;
        i-=2;
        System.out.println(i);



    }
}
