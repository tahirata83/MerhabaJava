package selfStudy.IfElse;

import java.util.Scanner;

public class KiloElseIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kilonuz");
        int kilo=sc.nextInt();
        System.out.println("Boyunuz");
        double boy=sc.nextDouble();
        double bki=(kilo/(boy*boy));
        System.out.println(bki);

        if (bki <= 25) {
            System.out.println("Zayif");
        } else if (bki >= 25 && bki < 30) {
            System.out.println("kilo");
        } else {
            System.out.println("Obez");
        }





    }
}
