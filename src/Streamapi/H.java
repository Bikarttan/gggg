package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class H {
    public static void main(String[] args) {
            String str="apple banana apple graps apple banana";
        Map<String, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
   System.out.println(map);

       Integer[]a={1,2,3,4,3,2,4,};
        Map<Integer, Long> collect = Arrays.asList(a).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(collect);


    }
}
