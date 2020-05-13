package lessons.gun8;

public class StringReplace {
    public static void main(String [] args){

        String s1="Java ogreniyorum";

        String s2=s1.replace("o","ö");

        System.out.println(s1.replaceFirst("o","ö"));
        System.out.println(s1);
        System.out.println(s1);

        System.out.println(s1.replace("o","ö"));
        System.out.println("===============================================================");

        String str="Ben Python ogreniyorum";
        System.out.println(str.replace("Python","Java"));
        String str1="Ben; Java. ogrenmeye devam ediyorum "; // Ben Java ogrenmeye devam ediyorum
        String str2= str1.replace(";"," ");
        String str3=str2.replace(".","");
        System.out.println(str3);

        String str4="Benim ismim Tahir";
        System.out.println(str4.replaceFirst("i","y"));
        System.out.println(str4.replaceAll("i","y"));
        System.out.println("===========================================================================");
        String s3="Tahir. Ata"; // Tahir Ata
        System.out.println(s3.replace("."," "));
        System.out.println(s3.replace(".",""));
        String s4="TahirAta"; // Tahir Ata
        System.out.println(s4.replace("r","r "));

    }

}




