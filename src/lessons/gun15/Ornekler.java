package lessons.gun15;

import java.util.Scanner;

public class Ornekler {
    public static void main(String[] args) {
//        int sayi=40;
//        System.out.println(sayi%3);
//        System.out.println(13%5);


        // Console girdigimiz sayi cift ise Bu sayi cifttir , tek ise Bu sayi tektir yazdiralim.

        Scanner scan=new Scanner(System.in);
//        System.out.println("Bir sayi giriniz: ");
//        int a=scan.nextInt();
//
//        if (a%2==0){     // % kalan bulmak icin kullanilir
//            System.out.println("Bu sayi cifttir");
//        }else {
//            System.out.println("Bu sayi tektir");
//        }

        // Console girdigimiz sayi pozitif ise Bu sayi pozitif ,
        //sifir ise bu sayi sifira esit geri kalanida Bu sayi negatif yazdiralim.
        System.out.println("Bir sayi giriniz:");
        int b=scan.nextInt();

        if(b>0){
            System.out.println("Bu sayi pozitiftir");
        }else if(b==0){
            System.out.println("Bu sayi sifir sayisidir");
        }else{
            System.out.println("Bu sayi negatiftir");
        }

    }
}
