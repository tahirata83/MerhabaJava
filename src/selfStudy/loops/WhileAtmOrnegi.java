package selfStudy.loops;

import java.util.Scanner;

public class WhileAtmOrnegi {
    public static void main(String[] args) {


      /*

        While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.

        İşlemler
        1.İşlem : Bakiye Öğrenme
        2.İşlem : Para Çekme
        3.İşlem : Para Yatırma
        Çıkış : q

        */
        Scanner scan = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.Islem:Bakiye Ogrenme\n"
                + "2.Islem:Para Cekme\n"
                + "3.Islem:Para Yatirma\n"
                + "Cikis icin q ye basin";
        System.out.println("=================================================================");
        System.out.println(islemler);
        System.out.println("=================================================================");

        while (true){
            System.out.println("Islemi seciniz");
            String islem=scan.nextLine();

            if(islem.equals("q")){

                System.out.println("Programdan cikiliyor");
                break;

            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz: "+ bakiye);

            }
            else if(islem.equals("2")){
                System.out.println("Cekmek istediginiz tutar");
                int tutar=scan.nextInt();
                scan.nextLine();
                if(bakiye-tutar<0){
                    System.out.println("yeterli bakiye yok... Bakiyeniz: "+ bakiye);
                }
                else {
                    bakiye=bakiye-tutar;
                    System.out.println("bakiyeniz:.. "+ bakiye);
                }
            }else if(islem.equals("3")){
                System.out.println("Yatirmak istediginiz tutar");
                int tutar=scan.nextInt();
                scan.nextLine();
                bakiye=bakiye+tutar;
                System.out.println("Yeni bakiyeniz "+ bakiye);

            }else{
                System.out.println("Gecersiz islem...");
            }
        }


















    }
}