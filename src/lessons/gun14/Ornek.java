package lessons.gun14;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen boy olcunuzu giriniz");

        double boy=scan.nextDouble();

        System.out.println("Lutfen kilonuz giriniz");

       int kilo=scan.nextInt();

        double kitleIndex=kilo/(boy*boy);

        if(kitleIndex<25){
            System.out.println("kitle indexiniz: " +kitleIndex);
            System.out.println("Zayif");
        }else if(25<=kitleIndex && kitleIndex>=30){
            System.out.println("kitle indexiniz: " +kitleIndex);
            System.out.println("ideal beden");
        }else{
            System.out.println("kitle indexiniz: " +kitleIndex);
            System.out.println("kilolusun");
        }

    }
}
