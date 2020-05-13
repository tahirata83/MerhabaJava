package lessons.gun13;

import java.util.Scanner;

public class ElseIfOrnek {
    public static void main(String[] args) {
        /* 0-5  -- sen daha bebeksin
            5-6 -- ana okuluna gitmelisin
            6-10  -- ilkoluna gitmelisin
            10-14 -- orta okula gitmelisin
            14- 18-- liseye gitmelisin
            18--30 -- universiteye gitmelisin
            30 dan sonra -- hicbiryere gidemezsin
         */
        System.out.println("Lutfen yasinizi giriniz:");
        Scanner scan=new Scanner(System.in);

        int yas=scan.nextInt();

        if (yas<=5) {
            System.out.println("sen daha bebeksin");
        } else if (yas <=6) {
            System.out.println("ana okuluna gitmelisin");
        } else if (yas <=10) {
            System.out.println("ilkoluna gitmelisin");
        } else if (yas <=14) {
            System.out.println("orta okula gitmelisin");
        } else if (yas <=18) {
            System.out.println("liseye gitmelisin");
        } else if (yas <=30) {
            System.out.println("universiteye gitmelisin");
        }
       else{
            System.out.println("hicbiryere gidemezsin");
        }

    }
}
