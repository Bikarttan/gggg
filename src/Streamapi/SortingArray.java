package Streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArray {
    public static void main(String[] args) {
        ArrayList<Employee>arrayList=new ArrayList<Employee>();
        arrayList.add(new Employee(1,"raju",67899));
        arrayList.add(new Employee(3,"bijy",46556));
        arrayList.add(new Employee(5,"sanju",54322));
        arrayList.add(new Employee(9,"pinky",23454));
        arrayList.add(new Employee(11,"debshis",57665));
//        System.out.println(arrayList);
//        for (Employee employee:arrayList) {
//            System.out.println(employee.getEId()+" "+employee.getName()+" "+ employee.getSalary());
//        }
//        System.out.println("After sorting****************************");
//        Collections.sort(arrayList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        for (Employee employee:arrayList) {
//            System.out.println(employee.getEId()+" "+employee.getName()+" "+ employee.getSalary());
//        }
        System.out.println("After sorting****************************");
        Collections.sort(arrayList,(o1,o2)->o1.getSalary().compareTo(o2.getSalary()));
        for (Employee employee:arrayList) {
            System.out.println(employee.getEId()+" "+employee.getName()+" "+ employee.getSalary());
        }
        
    }
}