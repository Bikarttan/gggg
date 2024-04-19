package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccuranceCharacter {

    public static void main(String[]args) {
        String str = "javat od kmnkln";
        List<String> strings = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(x -> x.getValue() == 2).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(strings);
//        System.out.println(" ");
//        StringBuilder sb=new StringBuilder(str);
//        StringBuilder builder = sb.reverse();
//        System.out.println(builder);


    }

    }
