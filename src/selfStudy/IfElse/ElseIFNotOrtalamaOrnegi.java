package selfStudy.IfElse;

import java.util.Scanner;

public class ElseIFNotOrtalamaOrnegi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Vize 1: ");
        int vize1=scan.nextInt();
        System.out.println("Vize 2: ");
        int vize2=scan.nextInt();
        System.out.println("Final: ");
        int finalnot=scan.nextInt();
        System.out.println("Okul ortalamaniz: ");
        double ortalama=scan.nextDouble();
        double toplamNot=(vize1*0.3)+(vize2*0.3)+(finalnot*0.4);
        
        if (toplamNot >= 90) {
            System.out.println("AA aldiniz...");
        } else if (toplamNot >=85) {
            System.out.println("BA aldiniz...");
        } else if (toplamNot >=80) {
            System.out.println("BB aldiniz...");
        } else if (toplamNot >=75){
            System.out.println("CB aldiniz...");
        }else if (toplamNot >=70){
            System.out.println("CC aldiniz...");
        }else if (toplamNot >=65){
            System.out.println("DC aldiniz...");
        }else if (toplamNot >=60){
            System.out.println("DD aldiniz...");
            if(ortalama<2.5){
                System.out.println("DD aldiniz ve not ortalamaniz dusuk.Bu dersi tekrar almayi dusunebilirsiniz");
            }
        }else if (toplamNot >=55){
            System.out.println("FD aldiniz ve kaldiniz...");
        }
        else{
            System.out.println("FF aldiniz ve kaldiniz...");
        }
    }
}
