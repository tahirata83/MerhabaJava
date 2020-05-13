package selfStudy.IfElse;

public class ElseIf {
    public static void main(String[] args) {
        int num=10;
        if (num>0){
            System.out.println("num is positive");
        }else if(num==0){
            System.out.println("num is zero");
        }
        else{
            System.out.println("num is negative");
        }
        System.out.println("==================================================================");

        String s="Hello";

        if(s.length()==5){
            System.out.println("it has enough length");
        }else if(s.contains("o")){
            System.out.println("it has o");
        }else{
            System.out.println("ignore this");
        }
        System.out.println("end");
        System.out.println("==================================================================");
    }
}
