package selfStudy;

import java.util.*;

public class WorkingWithArrays {
    public static void main(String[] args) {
        var a= 4;
        var str="kelime";
        var ch='a';
        var db=3d;
        var f=3.4f;
        System.out.println("============================================");

        // Swap number method 1
        int i1=20;
        int i2= 30;
        int temp=i1;
        i1=i2;
        i2=temp;
        System.out.println(temp);
        System.out.println("i1 is "+i1+" i2 is"+i2);
        // Swap number method 1

        int i3=20;
        int i4=30;
        i3+=i4-(i4=i3);;;
        System.out.println("i3 is "+i3+" i4 is"+i4);;


        System.out.println("============================================");
        int [] arr=new int[10];
        String[]kitaplar={"A kitap","B kitap","C kitap",};
        List<String> list=new ArrayList<>();
        Arrays.asList(kitaplar);
        list.addAll(Arrays.asList(kitaplar));
        System.out.println(list);

        String[]kitap={"A kitap","B kitap","C kitap","B kitap"};
        for (String s:list) {
            System.out.println(s);
        }



        String s1="AAAABBBCDE";// ABCDE
        String [] sArray=s1.split("");
        Map<String,Integer>map=new HashMap<>();
        for (String st:sArray) {
            if(!map.containsKey(st)) {
                map.put(st, 1);
            }else{
                map.put(st,map.get(st)+1);
            }


        }
        System.out.println(map);

    }
}
