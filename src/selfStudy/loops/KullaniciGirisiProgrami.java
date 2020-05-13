package selfStudy.loops;

import java.util.Scanner;

public class KullaniciGirisiProgrami {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        int giris_hakki=3;
        String sys_kullanici_adi="Tahir Ata";
        String sys_parola="121983";
        System.out.println("*************************************");
        System.out.println("Kullanici girisine hos geldiniz");
        System.out.println("*************************************");
        while (true){
            System.out.println("Kullanici Adi: ");
            String kullanici=scan.nextLine();
            System.out.println("Parola: ");
            String parola=scan.nextLine();

            if (kullanici.equals(sys_kullanici_adi)&& parola.equals(sys_parola)){
                System.out.println("Hosgelsiniz "+ kullanici);
                break;
            }else if(kullanici.equals(sys_kullanici_adi)&& !parola.equals(sys_parola)){
                System.out.println("Parolaniz yanlis");
                giris_hakki-=1;

            }else if(!kullanici.equals(sys_kullanici_adi)&& parola.equals(sys_parola)){
                System.out.println("Kullanici Adiniz yanlis");
                giris_hakki-=1;

            }else{
                System.out.println("Kullanici Adiniz ve Parolaniz yanlis");
                giris_hakki-=1;
            }

            if(giris_hakki==0){
                System.out.println("Giris hakkiniz bitti .Tekrar bekleriz");
                break;
            }
        }


    }}
