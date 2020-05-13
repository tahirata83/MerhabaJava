package selfStudy.methods;

public class MethodlardaReturn {

    public static int toplama(int a,int b,int c){

       // System.out.println("Toplamlari = "+ (a+b+c));
        return (a+b+c);
    }

    public static void main(String[] args) {

        toplama(3,4,5);
        System.out.println("Cikti degeri = "+ toplama(3,4,5));
    }
}
