package lessons.gun15;

import java.util.Scanner;

public class SwitchCaseOrnek2 {
    public static void main(String[] args) {
      /*
        homework2. hava durumunu derecelerine gore kelimelerle izah edin.
        40 den yukari asiri sicak, 30-40 arasi cok sicak, 20-30 arasi sicak,
        10-20 arasi ilik , 0-10 arasi soguk, 0 dan asagisi donuyor.

       */
        Scanner scan = new Scanner(System.in);
        String hava = "Hava durumlari:  \n"
                + "1.Soguk havalar(-50 ile 0 arasinda)\n"
                + "2.Ilik  havalar(0 ile 20 arasinda)\n"
                + "3.Sicak havalar(20 ile 50 arasinda)\n";
        System.out.println(hava);
        System.out.println("Hava durumunu giriniz");
        int durum = scan.nextInt();

        switch (durum) {
            case 1:
                System.out.println("-50 ile 0 arasinda bir derece giriniz");
                int derece = scan.nextInt();
                if (-50 <= derece && 0 >= derece) {
                    System.out.println("Hava buz gibi");
                } else {
                    System.out.println("Dereceyi yanlis girdin");
                }
                break;
            case 2:
                System.out.println("0 ile 20 arasinda bir derece giriniz");
                int derece1 = scan.nextInt();
                if (0 < derece1 && 20 >= derece1) {
                    System.out.println("Havalar ilik");
                } else {
                    System.out.println("Dereceyi yanlis girdin");
                }
                break;
            case 3:
                System.out.println("20 ile 50 arasinda bir derece giriniz");
                int derece2 = scan.nextInt();
                if (20 < derece2 && 50 >= derece2) {
                    System.out.println("Havalar sicak");
                } else {
                    System.out.println("Dereceyi yanlis girdin");
                }
                break;

            default:
                System.out.println("Boyle hava durumunu tanimlayamiyorum");
        }


    }

}






