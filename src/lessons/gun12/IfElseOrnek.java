package lessons.gun12;

import java.util.Scanner;

public class IfElseOrnek {
    public static void main(String[] args) {
        System.out.println("Dogru bir sekilde selamlayin:");
        Scanner scan=new Scanner((System.in));
         String s1=scan.nextLine();
         if (s1.equals("Merhaba")){
             System.out.println("Dogru kelime girdiniz");
         }else{
             System.out.println("Yanlis kelime girdiniz");
         }



        System.out.println("Benzer olan iki kelime giriniz");

         String s2=scan.nextLine();
         String s3=scan.nextLine();

        if (s2.equals(s3)){
             System.out.println("benzer kelimeler girdiniz");
         }else{
             System.out.println("benzer kelimeler girmediniz");
        }
    }
}
