package Streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E   {
    public static void main(String[] args) {
        int[]a={2,4,5,6,7};
        int[]b={2,8,4,9,3};
        Arrays.stream(a).filter(num->Arrays.stream(b).anyMatch(num2->num2==num)).forEach(System.out::println);

        String[] str={"apple", "bananna","mango"};
      Map<String,Long>map= Arrays.stream(str).collect(Collectors.groupingBy(x->x,Collectors.counting()));
      map.forEach((word,count)->System.out.println(word+count));
        String originalString = "This is a string with spaces";
        String stringWithout = originalString.replaceAll("\\s", "");

        System.out.println(stringWithout);



    }


}
