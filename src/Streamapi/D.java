package Streamapi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D {
    public static void main(String[] args) {
//        int a=10,b=20;
//        int t;
//        t=a;
//        a=b;
//        b=t;
////        a=a+b;
////        b=a-b;
////        a=a-b;
////        System.out.println("a"+a);
////        System.out.println("b"+b);
//        System.out.println("a"+a);
//        System.out.println("b"+b);

        Map<Integer,String>map=new HashMap<>();
        map.put(1,"manoj");
        map.put(2,"bijay");
        map.put(3,"gudu");
        map.put(4,"rajesh");
        Set set=map.entrySet();
        Iterator itr= set.iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,String>entry=(Map.Entry<Integer,String>)itr.next();
            System.out.println(entry.getValue());
        }





    }
}
