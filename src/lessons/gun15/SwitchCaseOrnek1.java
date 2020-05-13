package lessons.gun15;

import java.util.Scanner;

public class SwitchCaseOrnek1 {
    public static void main(String[] args) {
      /*
        homework2. hava durumunu derecelerine gore kelimelerle izah edin.
        40 den yukari asiri sicak, 30-40 arasi cok sicak, 20-30 arasi sicak,
        10-20 arasi ilik , 0-10 arasi soguk, 0 dan asagisi donuyor.

       */
        Scanner scan=new Scanner(System.in);
        System.out.println("Dereceyi giriniz:");
        int derece=scan.nextInt();

        switch (derece){
            case 0:
                System.out.println("Hava buz gibi");
                break;
            case 10:
                System.out.println("Hava soguk");
                break;
            case 20:
                System.out.println("Hava normal");
                break;
            case 30:
                System.out.println("Hava sicak");
                break;
            case 40:
                System.out.println("Hava cok sicak");
                break;
            case 50:
                System.out.println("Hava asiri sicak");
                break;
            default:
                System.out.println("Abartili hava durumu");
            }
        }






    }


