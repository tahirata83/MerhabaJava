package selfStudy.loops;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

         /*
            break anahtar kelimesi

            Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
            Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.

            break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa
            ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.

            continue anahtar kelimesi

            Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı zaman geri kalan
            işlemlerini yapmadan direk döngü bloğunun başına döner.

         */

        System.out.println("================================================================================");

        /*

        int i=0;
        while (i<20){
            if (i==10){
                break;
            }
            System.out.println("i = " + i);
            i++;

         */

        System.out.println("================================================================================");

        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        while (true){
            int islem=scan.nextInt();
            if(islem==-1){
                System.out.println("Donguden cikilior");
                break;
            }
            System.out.println("islem : "+ islem);
        }
         */

        System.out.println("================================================================================");

        /*
        for (int i = 0; i < 10 ; i++) {
            if(i==3 || i==5){
                continue;
            }
            System.out.println("i =" +i);
        }

         */

        System.out.println("================================================================================");

        int i=0;
        while (i<10){
           if(i==3 || i ==5){
               i++;  // bunu ypmayinca ne oluyor aciklaama yap
               continue;
           }
            System.out.println("i =" +i);
           i++;
        }




         }
    }

