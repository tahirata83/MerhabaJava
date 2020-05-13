package lessons.gun11;

public class IfElseCondition {
    public static void main(String[] args) {
         /*
        if (koşul){
            Kosul saglaninca(true) bu blok calisir
        }

        else{
            bu blogun ustendeki herhaangi kosul saglanmadigi zaman bu blok calisir
        }
       */
        System.out.println("if kosulu sagladigi zaman================================");

        if(2==2){
            System.out.println("kosul saglandi");
        }else{
            System.out.println("kosul saglanmadi");
        }


        System.out.println("if kosulu saglamadigi zaman================================");

        if(2==3){
            System.out.println("kosul saglandi");
        }else{
            System.out.println("kosul saglanmadi");
        }


    }
}
