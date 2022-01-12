package TaskB.Chapter7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Определить, являются ли слова анаграммами, т.е. можно ли из одного слова
 * составить другое перестановкой букв.
 */
public class Task2 {
    public static void main(String[] args) {
        String str1 = "Собака";
        String str2 = "Окасоб";
        Stream<String> stream1 = Arrays.stream(str1.split(""));
        Stream<String> stream2 = Arrays.stream(str2.split(""));
        List<String> collect2 = stream1.map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toList());
        List<String> collect3 = stream2.map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toList());
        if (collect2.equals(collect3)) {
            System.out.println(str1 + " and " + str2 + " are anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
        System.out.println(collect2 + " and " + collect3);


    }
}
