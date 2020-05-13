package lessons.gun11;

public class ExampleConditionals {
    public static void main(String[] args) {
        int sayi1=25;
        int sayi2=29;
        int sayi3=56;
        int max=sayi1;

        if (max<sayi2){
            max=sayi2;
        }

        if (max<sayi3){
            max=sayi3;
        }
        System.out.println("max sayisi: "+max);
    }
}
