package lessons.gun12;

public class MinBulma1 {
    public static void main(String[] args) {
        int a= 74;
        int b=32;
        int c=3;

        int min=c;

        if(min>b) {
            min = b;
        }

        if (min > a) {
            min = a;
        }

        System.out.println(min);

    }
}
