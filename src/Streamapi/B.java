package Streamapi;

import java.util.ArrayList;


import java.util.Collections;
import java.util.List;

public class B {

    public static void main(String[] args) {

        ArrayList<Customer>arrayList=new ArrayList<Customer>();
        arrayList.add(new Customer(1,"raju",67899));
        arrayList.add(new Customer(3,"bijy",46556));
        arrayList.add(new Customer(5,"sanju",54322));
        arrayList.add(new Customer(9,"pinky",23454));
        arrayList.add(new Customer(11,"debshis",57665));
        Collections.sort(arrayList,(o1,o2)->o1.getSalary().compareTo(o2.getSalary()));
        for(Customer cs:arrayList){
            System.out.println(cs.getSalary()+""+cs.getCusName());
        }
    }
}

