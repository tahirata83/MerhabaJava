package selfStudy.IfElse;

import java.util.Scanner;

public class IfElseOrnek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a number please:");
        long number=scan.nextLong();
        if (number>=-128 && number <=127){
            System.out.println("Data type is byte");
        }else if (number>=-32768 && number <=32767){
            System.out.println("Data type is short");
        }else if (number>=Integer.MIN_VALUE && number <=Integer.MAX_VALUE){
            System.out.println("Data type is int");
        }else if (number>=Long.MIN_VALUE && number <=Long.MAX_VALUE){
            System.out.println("Data type is long");
        }else{
            System.out.println("out of range");
        }
    }
}
