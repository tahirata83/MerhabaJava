package lessons.gun9;

public class IfStatement {
    public static void main(String[] args) {
        if(2+(-2)==0){
            System.out.println("kosul dogru ise print eder");
        }

        System.out.println("================================================");


        if(5>3){
            System.out.println("kosul saglandi");
        }
        System.out.println("================================================");
        // System.out.println(5>3);

        if(5!=6){    // !=   esit degildir
            System.out.println("ok");
        }
        System.out.println("================================================");

       String atmSifresi="aSd2";
        String beklenenSifre="aSd2";
        if(atmSifresi==beklenenSifre){
            System.out.println("giris basarili");
        }

        System.out.println("================================================");


       String s1="ata";
        String s2="ata";

        System.out.println(s1==s2);
        System.out.println("================================================");

       if(s1==s2){
            System.out.println("iki String esittir");
       }
        System.out.println("================================================");

       if(true==false){
           System.out.println("1.OK");
       }
        System.out.println("================================================");
       if (false==false){
           System.out.println("2.Ok");
       }

        System.out.println("================================================");

        if (123127368+(-2481401)==242344814){
            System.out.println("Kosul dogru ise print eder");
        }
        if (3+7==5){
            System.out.println("Kosul dogru degil");
        }
        if (6-1!=3){
            System.out.println("Bu yazarsa anladim demektir");
        }


    }
}
