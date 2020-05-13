package selfStudy.IfElse;

import java.util.Scanner;

public class IfElse2Scanner {
    public static void main(String[] args) {
        System.out.println("enter temp degree");
        Scanner scan=new Scanner(System.in);
        int temp = scan.nextInt();
        if (temp > 30) {
            System.out.println("Hot");
        } else if (temp > 10 && temp < 30) {
            System.out.println("Warm");
        } else if (temp > 0 && temp < 10) {
            System.out.println("Cold");
        } else {
            System.out.println("Freezing");
        }




    }
}
