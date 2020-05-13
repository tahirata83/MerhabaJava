package selfStudy.methods;

public class Ovrloading {

    public  static  void  toplama(String a,String b){
        System.out.println(a+" "+b);

    }

    public  static  void  toplama(int a,int b){
        System.out.println("Toplamlar= "+ (a+b));

    }

    public  static  void  toplama(int a,int b, int c){
        System.out.println("Toplamlar= "+ (a+b+c));

    }




    public static void main(String[] args) {



        toplama(2,5);
        toplama(2,3,4);
        toplama("Tahir","Ata");


    }

}
