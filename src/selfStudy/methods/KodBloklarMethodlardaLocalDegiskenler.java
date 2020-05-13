package selfStudy.methods;

public class KodBloklarMethodlardaLocalDegiskenler {


    public static void main(String[] args) {
        int a=4;
        String yazdir="Merhaba";

        if(a<10){
            int b=5;
            System.out.println(yazdir);
            System.out.println(b);
        }

       // System.out.println(b);    b degiskeni if blogun icinde tanimlandigi icin disinda kullanamiyoruz

        System.out.println("*******************************************************************************");

        int j=6;
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            System.out.println(j);
        }

       // System.out.println(i);   i degiskeni if blogun icinde tanimlandigi icin disinda kullanamiyoruz
           System.out.println(j);  //  j degiskeni for blogunun disinda oldugu icinde hem
                                    // disinda hem icinde kullanabiliyoruz

        System.out.println("*******************************************************************************");

        int num=1;

        while(num<10){
            if(num%2==0){
                String yaz="Cift";
                System.out.println(yaz);
            }
         //   System.out.println(yaz);    // yaz degiskeni while blogu icinde oldugu icin
                                          // while blogu disinda yazdiramiyoruz
            num++;
        }

    }
}
