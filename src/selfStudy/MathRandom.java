package selfStudy;

import org.w3c.dom.ls.LSOutput;

public class MathRandom {
    public static void main(String[] args) {
        //Random numbers in java use  -----> Math.random()
        System.out.println(Math.random());   // to print random
        System.out.println("=======================================================================");
        int min =1;
        int max= 10;
        int randomInRange=min+(int)(Math.random()*((max-min)+1));
        System.out.println(randomInRange);
        System.out.println("=======================================================================");

        double random=Math.random();  // 0,0000000001-0,9999999999
        System.out.println(random);

        // this give us a random number between 0 and "int max"
        int max1= 10;
        double r1=random*max1;
        int i1=(int)r1;
        System.out.println(r1);
        System.out.println(i1);

        System.out.println("Task 1 and solution=======================================================================");
        //TODO task1:print random integer number between 0 and 100
        //     task2: print 2 random  integer numbers between 0 and 10;

        int max2=100;
        double r2=random*max2;
        int i2=(int)r2;
        System.out.println(r2);
        System.out.println(i2);
        System.out.println((int)(Math.random()*100));// shortcut printing random

        System.out.println("Task 2 and solution=======================================================================");

        int max3=10;
        double r3=random*max3;
        int i3=(int)r3;
        System.out.println(i3);
        System.out.println((int)(Math.random()*max3));


        System.out.println("Random in Range between two numbers=======================================================================");
        int min4= 0;
        int max4=3;
        int range0=max4-min4;
        int randomInRange0=min4+(int)(Math.random()*(range0+1));
        System.out.println(randomInRange0);

        if(randomInRange0==0){
            System.out.println("Zero");}
        if(randomInRange0==1){
            System.out.println("One");
        }if(randomInRange0==2){
            System.out.println("Two");
        }if(randomInRange0==3){
            System.out.println("Three");
        }

        System.out.println("Random number(negative or pozitive) in Range between two numbers=======================================================================");
        int min5= -200;
        int max5=200;
        int range=max5-min5;
        int randomInRange1=min5+(int)(Math.random()*(range+1));
        System.out.println(randomInRange1);

        if(randomInRange1<0){
            System.out.println("negative");}
        if(randomInRange1==0){
            System.out.println("Zero");
        }if(randomInRange1>0){
            System.out.println("pozitive");
        }


        System.out.println(" Random number(even or odd) in Range between two numbers=======================================================================");
        int min6= 0;
        int max6=200;
        int range1=max6-min6;
        int randomInRange2=min6+(int)(Math.random()*(range1+1));
        System.out.println(randomInRange2);

        if((randomInRange2%2)==0){
            System.out.println("even");}
        if((randomInRange2%2)==1){
            System.out.println("odd");
        }
        System.out.println("==================================================");
        System.out.println("Write a program that sums 2 random integer numbers");
        int min7=0;
        int max7=10;
        double r7=Math.random();
        int range7=max7-min7;
        int i7=min7+(int)(Math.random()*(range7+1));

        int min8=0;
        int max8=100;
        double r8=Math.random();
        int range8=max8-min8;
        int i8=min8+(int)(Math.random()*(range8+1));

        int sum =i7+i8;
        System.out.println(sum);

// 2.way
        System.out.println("2.way==========================================");
         int a=(int)(Math.random()*10);
         int b=(int)(Math.random()*100);
         int sum1=a+b;
        System.out.println(sum1);
    }


}
