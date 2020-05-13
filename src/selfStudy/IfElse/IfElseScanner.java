package selfStudy.IfElse;

import java.util.Scanner;

public class IfElseScanner {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("num is bigger than 0");
        } else if (num < 0) {
            System.out.println("num is less than 0");
        } else {
            System.out.println("num is zero");
        }
        System.out.println("==================================================================");
        // write a program that print temperature is human readdable words
        //ex:70=>hot


    }
}