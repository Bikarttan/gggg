package Streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Impl{
    public static void main(String[] args) {

      int[]numbers={5,2,3,6,1};
      countnumbers(numbers);

      System.out.println("*****************************************************************");
      int[]array1={1,2,3,4,5};
      int[]array2={4,5,6,7,8};

        fetchcommonelement(array1,array2);
        System.out.println("*****************************************************************");

      String[]strings={"Apple","Bannan","Apricot","Grapes"};

       int maxlenght= Arrays.stream(strings).mapToInt(String::length).max().orElse(0);
       System.out.println(maxlenght);

    }
    public static void countnumbers(int[]s){

        Arrays.stream(s).sorted().skip(1).limit(1).forEach(System.out::println);
    }
    public static void fetchcommonelement(int[]arr1,int[]arr2){
        Arrays.stream(arr1).filter(number->Arrays.stream(arr2).anyMatch(arr2number->arr2number==number)).forEach(System.out::println);
    }





    }

