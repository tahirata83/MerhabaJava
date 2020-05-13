package lessons.gun15;

import java.util.Scanner;

public class SwitchCaseOrnek3 {
    public static void main(String[] args) {
        String statu="Statuler:       \n"
                +"Ogretmen\n"
                +"Ogrenci\n"
                +"Mudur yardimcisi\n"
                +"Personel\n"
                +"Mudur\n";
        Scanner scan=new Scanner(System.in);
        System.out.println(statu);
        System.out.println("Statunuz girin");
        String sStatu=scan.nextLine();
        switch (sStatu){
            case "Ogretmen":
                String ogrt="1.Maasim   \n"
                        +"2.Ders saatlerim\n"
                        +"3.Toplantilarim\n"
                        +"4.Nobetlerim\n"
                        +"5.Izinlerim\n";
                System.out.println(ogrt);
                System.out.println("yapmak istedigin islemin numarasini sec");
                int islem=scan.nextInt();
                switch (islem){
                    case 1:
                        System.out.println("Masiniz 1000 dolar");
                        break;
                    case 2:
                        System.out.println("ders saaaatleriniz alttaki gibidir");
                        break;
                    case 3:
                        System.out.println("Su su gunlerde toplantilarin vardir");
                        break;
                    case 4:
                        System.out.println("Nobet gunleriniz pazartesi ve sali");
                        break;
                    case 5:
                        System.out.println("Yillik izinlerin ogrenmek icin personel bolumu ile yuzyuzue gorusunuz");
                        break;
                    default:
                        System.out.println("Boyle bir  islem yoktur");
                }

                break;
            case "Ogrenci":
                System.out.println("Sevgili ogrencimz buyrun ne istiyorsunuz");
                break;
            case "Mudur":
                System.out.println("Sevgili mudurumuz buyrun ne istiyorsunuz");
                break;
            case "Mudur yardimcisi":
                System.out.println("Sevgili mudur yardimcimiz buyrun ne istiyorsunuz");
                break;
            case "Personel":
                System.out.println("Sevgili personel buyrun ne istiyorsunuz");
                break;
            default:
                System.out.println("boyle bir statumuz yok");
        }



    }
}
