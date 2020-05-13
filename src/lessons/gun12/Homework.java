package lessons.gun12;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // - 5 tane int sayisi icinden en buyuk int sayiyi bul
        System.out.println("Ornek1 cozumu===============================================");
        int a= 77;
        int b=32;
        int c=3;
        int d=34;
        int e=21;

        int max=c;
        if(max<a){
            max=a;
        }
        if(max<b){
            max=b;
        }
        if(max<d){
            max=d;
        }
        if(max<e){
            max=e;
        }
        System.out.println("En buyuk sayimiz " +max);

        //- 5 tane int sayisi icinden en kucuk int sayiyi bul
        System.out.println("Ornek2 cozumu===============================================");
        int i1= 77;
        int i2=32;
        int i3=3;
        int i4=34;
        int i5=21;
        int min=i4;


        if(min>i1) {
            min = i1;
        }

        if (min > i2) {
            min = i2;
        }
        if(min>i3) {
            min = i3;
        }

        if (min > i5) {
            min = i5;
        }

        System.out.println("En kucuk sayimiz "+min);



        //- Console 5 sayi girin ve onlarin karelerinin toplamini bulun
        System.out.println("Ornek3(5 sayi girin) cozumu===============================================");
        Scanner sc=new Scanner(System.in);

        int sayi1=sc.nextInt();
        int sayi2=sc.nextInt();
        int sayi3=sc.nextInt();
        int sayi4=sc.nextInt();
        int sayi5=sc.nextInt();

        System.out.println(sayi1*sayi1+sayi2*sayi2+sayi3*sayi3+sayi4*sayi4+sayi5*sayi5);

        // -Console 3 sayi girin : sayi1 ,sayi2,sayi3 olsun  (sayi1+sayi2)-sayi3 un karesi
        System.out.println("Ornek4(3 sayi girin) cozumu===============================================");

       int num1= sc.nextInt();
       int num2= sc.nextInt();
       int num3=sc.nextInt();

        System.out.println((num1+num2)-num3*num3);





    }
}
