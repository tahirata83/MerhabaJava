package lessons.gun13;

import java.util.Scanner;

public class ScannerDevam {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int sayi1= scan.nextInt();
        scan.nextLine();
        String kelime1=scan.nextLine();

//        String kelime1=scan.nextLine();
//        int sayi1= scan.nextInt();

        System.out.println(sayi1*sayi1);
        System.out.println(kelime1.length());
    }
}
