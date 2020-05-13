package lessons.gun14;

import lessons.gun13.ScannerDevam;

import java.util.Scanner;

public class HomeworkSolution {
    public static void main(String[] args) {
        /*
        homework. console girdigimiz sayinin tipini ogrenmek istedigimiz programi yaziniz.
        byte ve long araliginda olacak. hatirlatma: byte<short<int<long. else if kullaniniz
         */
        Scanner scan=new Scanner(System.in);


        /*
        System.out.println("Bir tamsayi giriniz");



        long sayi=scan.nextLong();

        if (sayi>=Byte.MIN_VALUE && sayi<=Byte.MAX_VALUE){
            System.out.println("sayi tipi byte dir");
        }else if(sayi>=Short.MIN_VALUE && sayi<=Short.MAX_VALUE){
            System.out.println("sayi tipi short dir");
        }else if(sayi>=Integer.MIN_VALUE && sayi<=Integer.MAX_VALUE){
            System.out.println("sayi tipi int dir");
        }else{
            System.out.println("sayi tipi long dir");
        }

        long a=233232323537743l;


         */

        System.out.println("=======================================================================");

        /*
        homework2. hava durumunu derecelerine gore kelimelerle izah edin.
        40 den yukari asiri sicak, 30-40 arasi cok sicak, 20-30 arasi sicak,
        10-20 arasi ilik , 0-10 arasi soguk, 0 dan asagisi donuyor.
         */
        System.out.println("Bir derece giriniz");

        int derece=scan.nextInt();

//        if (derece>=40){
//            System.out.println("hava asiri sicak");
//        }else if(derece>=30 && derece<40){
//            System.out.println("hava cok sicak");
//        }else if(derece>=20 && derece<30) {
//            System.out.println("havalar sicak");
//        }else if(derece>=10 && derece<20) {
//            System.out.println("havalar ilik");
//        }else if(derece>=0 && derece<10){
//                System.out.println("havalar soguk");
//        }else{
//            System.out.println("hava buz gibi");
//        }


        if(derece<=0){
            System.out.println("Havalar buz gibi");
        }else if(derece<=10){
            System.out.println("havalar soguk");
        }else if(derece<=20){
            System.out.println("havalar ilik");
        }else if(derece<=30){
            System.out.println("havalar sicak");
        }else if(derece<=40){
            System.out.println("havalar cok sicak");
        }else {
            System.out.println("havalar asiri sicak");
        }

        System.out.println("=======================================================================");

        /*
        homework 3. ogrenciyi aldigi nota gore degerlendirin. 100-85 almissa "Harika",
        84-70 almissa "cok iyi", 69-55 almissa "eh iyi iste",
         54-40 almissa"calisirsan daha iyi olacak",
          39 ve alti not alirsa "bu gidisle sinifta kalacaksin" . else if kullanin
         */
        System.out.println("Aldiginiz notu giriniz");
        int not=scan.nextInt();

        if(not>=85){
            System.out.println("Harika");
        }else if(not>=70){
            System.out.println("Cok iyi");
        }else if(not>=55){
            System.out.println("Iyi");
        }else if(not>=40){
            System.out.println("calisirsan daha iyi olacak");
        }else {
            System.out.println("bu gidisle sinifta kalacaksin");
        }
    }
}
