package selfStudy.IfElse;

public class IfElse {
    public static void main(String[] args) {


        String s1 = "Hi!";
        if (s1.equals("Hello")) {
            System.out.println("Bonjour");
        }else{
            System.out.println("Dont understand");
        }
        System.out.println("==================================================================");
        int num1 =19;
        if(num1%2==0){
            System.out.println("num1 is even");
        }else{
            System.out.println("num1 is odd");
        }
        System.out.println("==================================================================");

        int num2=10;
        if (num2>0){
            System.out.println("num2 is positive");
        }else{
            System.out.println("num2 is negative");
        }
        System.out.println("==================================================================");
    }
}