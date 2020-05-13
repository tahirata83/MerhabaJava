package selfStudy;

import java.util.Scanner;

public class userInputTask {
    public static void main(String[] args) {
        System.out.println("bir kelime yazin:");
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        if(s1.equalsIgnoreCase("zero")){
            System.out.println(0);
        }if(s1.equals("one")){
            System.out.println(1);
        }if(s1.equals("two")){
            System.out.println(2);
        }if(s1.equals("three")){
            System.out.println(3);
        }




    }
}
