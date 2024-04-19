package Streamapi;

import java.util.*;


public class A {


    public static void main(String[]args) {

     Map<String,Integer>map=new HashMap<>();
     map.put("manoj",2);
        map.put("rajesh",3);
        map.put("gudu",6);
        map.put("raju",9);
        Collection c=map.keySet();
        ArrayList<Integer>arrayList=new ArrayList<>(c);
        System.out.println(arrayList);

    }
}
