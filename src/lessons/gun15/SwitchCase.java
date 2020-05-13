package lessons.gun15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
         /*
        switch(op){
        case durumu1:
        islemler
        break
        case durumu2:
        islemler
        break
        //
        //

        default:
        islemler
        break
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Islem numarisi girin");
        int islem=sc.nextInt();

        switch (islem){
            case 1:
                System.out.println("1.Islem");
                break;
            case 2:
                System.out.println("2.Islem");
                break;
            case 3:
                System.out.println("3.Islem");
                break;
            case 4:
                System.out.println("4.Islem");
                break;
            case 5:
                System.out.println("5.Islem");
                break;
            default:
                System.out.println("Gecersiz islem");
        }







    }
}
