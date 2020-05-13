package selfStudy.methods;

import java.util.Scanner;

public class KodBloklarMethodlardaLocalDegiskenler1 {

    public static  void selamlama(){
        System.out.println("Merhaba, Nasilsiniz? ");
        System.out.println("Selamlar...");
    }


    public  static  void faktoriyel(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        int faktoriyel=1;

        while(sayi>0){

                faktoriyel=faktoriyel*sayi;
                sayi--;

            }
            System.out.println("Faktoriyel esittir= "+faktoriyel);
        }

    public static void main(String[] args) {


        selamlama();
        faktoriyel();


    }
}
