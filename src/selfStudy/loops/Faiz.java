package selfStudy.loops;

import java.util.Scanner;

public class Faiz {
    public static void main(String[] args) {
          /*
        Faiz Uygulaması
        Kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
        bilgisini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.

        Faiz Oranı : %6 Faiz Oranı

        */


        Scanner scan=new Scanner(System.in);
        System.out.println("Bankamiza hos geldiniz .Faiz orani %6 ");
        int anapara,vade;
        System.out.println("Yatirmak istediginiz tutar");
        anapara=scan.nextInt();
        System.out.println("Paranizi kac yil vadeli yatirmak istiyorsnuz? ");
        vade=scan.nextInt();

        double toplamPara=anapara;
        double faizOrani=0.06;

        for (int i = 1; i <=vade; i++) {
            toplamPara=(toplamPara*faizOrani)+toplamPara;
            System.out.println(i+ ". yilin sonunda toplam para " +(int)toplamPara);


        }

    }
}
