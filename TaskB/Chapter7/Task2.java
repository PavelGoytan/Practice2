package TaskB.Chapter7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Определить, являются ли слова анаграммами, т.е. можно ли из одного слова
 * составить другое перестановкой букв.
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> list = List.of("Собака", "Акасоб");
        Comparator<String> comparator = (s1,s2) -> s1.length()-s2.length();
        List<String> collect = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(collect.toString());


    }
}
