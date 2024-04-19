package Streamapi;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Company {
    public static void main(String[] args) {

        String s="mynameBikarttan";
        Map<String, Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);


//        List<String> list = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().filter(c -> c.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println(list);



    }


    }


