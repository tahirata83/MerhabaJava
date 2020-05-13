package lessons.gun13;

import java.util.Scanner;

public class ElseIfOrnekAtm {
    public static void main(String[] args) {
        /*
        1- eksik rakam girdiniz
        2- 4 rakam girdiniz fakat sifre yanlis
        3- sifre kabul edildi
        4- 4 ten fazla rakam   girdiniz

         */
        System.out.println("Lutfen sifreni gir");
        Scanner sc=new Scanner(System.in);

        int sifrem=2934;

        int password= sc.nextInt();
        if(password<1000){
            System.out.println("eksik rakam girdiniz");
        } else if(password < 10000 && password!=sifrem) { // 4 rakam ama ve password sifreye esit degildir
            System.out.println("4 rakam girdiniz fakat sifre yanlis");
        } else if(password==sifrem){
            System.out.println("sifre kabul edildi");
        } else{
            System.out.println("4 ten fazla rakam   girdiniz");
        }
    }
}
