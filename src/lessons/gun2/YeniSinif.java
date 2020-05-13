package lessons.gun2;
public class YeniSinif {

    public static void main(String[] args) {

        String cumle = "Ben Java Ogrenmeye Basladim.";   // degisken kullanarak
        System.out.println(cumle);
        System.out.println("=================================================================");
        System.out.println("Ben Java Ogrenmeye Basladim.");  // degisken kullanmadan

        System.out.println("=================================================================");

        String kelime1= "Ben";
        String kelime2="Java";
        String kelime3="Ogrenmeye";
        String kelime4="Basladim";

        System.out.println(kelime1);
        System.out.println(kelime2);
        System.out.println(kelime3);
        System.out.println(kelime4);

        System.out.println("=================================================================");

        System.out.print(kelime1);
        System.out.print(kelime2);
        System.out.print(kelime3);
        System.out.print(kelime4);
        System.out.println("=================================================================");

        System.out.println(kelime1+" "+kelime2+" "+kelime3+" "+kelime4+".");          // degisken kullanarak yaziyorum
        System.out.println("Ben"+" "+ "Java"+" "+"ogrenmeye"+" "+"Basladim"+".");      // degisken kullanmadan yaziyorum

        //  ornek-1

        /* Ben Javayi cok sevdim.
           1- Degisken kullanmadan normal bir sekilde yazdirin ======> Ben Javayi cok sevdim.
           2-Degisken kullanmadan bitisik bir sekilde yazdiri   ======> BenJavayicoksevdim.
           3- Degisken kullanarak  normal bir sekilde yazdirin ======> Ben Javayi cok sevdim.
           4-  Degisken kullanarak  bitisik bir sekilde yazdirin ======> BenJavayicoksevdim.
           5- Degisken kullanarak  alt alta  olacak sekilde yazdirin ======> Ben
                                                                            Javayi
                                                                            cok
                                                                            sevdim.
         */


        System.out.println(" Cevap1=================================================================");
        System.out.println("Ben Javayi cok sevdim.");
        System.out.println(" Cevap2=================================================================");
        System.out.print("Ben "+"Javayi"+"cok"+"sevdim.");
        System.out.println(" Cevap3=================================================================");
        String str="Ben Javayi cok sevdim.";
        System.out.println(str);
        System.out.println(" Cevap4=================================================================");
        String str1="BenJavayicoksevdim.";
        System.out.println(str1);
        String a="Ben";
        String b="Javayi";
        String c="cok";
        String d="sevdim.";
        System.out.println(a+b+c+d);
        System.out.println(" Cevap5================================================================");
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d);



    }

}