package Streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Abc {

        public static void main(String[]args) {

            List<String> s = Arrays.asList("manoj", "bikash");
            char targetChar = 'a';

            List<Integer> occurrenceCounts = s.stream()
                    .map(str -> (int) str.chars().filter(c -> c == targetChar).count())
                    .collect(Collectors.toList());

            System.out.println(occurrenceCounts);
        }
}