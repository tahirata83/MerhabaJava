package selfStudy.loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
         /*
        for (baslatma ; kosul ; artırma veya azaltma işlemleri) {
            Döngü koşulumuz doğru olduğu sürece burası çalışacak.
             }
          */

        System.out.println("===========================================================");

        /*
        int i;

        for ( i = 0; i <5 ; i++) {
            System.out.println("i= "+ i);
        }

         */
        System.out.println("===========================================================");

        /*
        for (int i = 0; i < ; i++) {
            System.out.println(i);
        }

        */
        System.out.println("===========================================================");

        /*
        for (int j = 10; j >0 ; j--) {
            System.out.println("j= "+ j);
        }

         */

        System.out.println("===========================================================");
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("Ben java ogreniyorum");
        }

        // numaralandirarak yap-- 1.Ben java ogreniyorum, 2.Ben java ogreniyorum ......

        */
        System.out.println("===========================================================");
        /*
        int i=0;
        int j=10;
        for (; i <10 && j>0 ; i++,j--) {
            System.out.println("i= "+ i);

            System.out.println("j= "+ j);
        }

         */

        System.out.println("===========================================================");
        /*
        for (int i = 2; i <100 ; i*=2) {
            System.out.println("i = "+ i);

        }

         */
        System.out.println("===========================================================");
        Scanner sc =new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int faktoriyel=1;
        int sayi=sc.nextInt();

        for (int i = 1; i <= sayi; i++) {
            faktoriyel=faktoriyel*i;      // faktoriyel*=i;
            System.out.println("Faktoriyel ="+ faktoriyel + " i =" +i);

        }
        System.out.println(faktoriyel);





    }
}
