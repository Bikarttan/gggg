package Streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Programs {
    public static void main(String[] args) {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

        List<String> filteredMonths = months.stream()
                .filter(month -> month.length() < 6 && isVowel(month.charAt(0)))
                .collect(Collectors.toList());

        System.out.println("Months that start with a vowel and have a length less than 6:");
        filteredMonths.forEach(System.out::println);
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;

    }
}