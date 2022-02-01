package TaskB.Chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * С использованием множества выполнить попарное суммирование произ-
 * вольного конечного ряда чисел по следующим правилам: на первом этапе
 * суммируются попарно рядом стоящие числа, на втором этапе суммируются
 * результаты первого этапа и т.д. до тех пор, пока не останется одно число.
 *
 * Задан список целых чисел и некоторое число X. Не используя вспомога-
 * тельных объектов и методов сортировки и не изменяя размера списка, пе-
 * реставить элементы списка так, чтобы сначала шли числа, не превосходя-
 * щие X, а затем числа, больше X.
 */
public class Task8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(24);
        list.add(33);
        list.add(47);
        list.add(19);
        list.add(51);
        list.add(68);
        list.add(75);
        Integer n = 35;
        Integer reduce = list.stream()
                .reduce(0, Integer::sum);
        Map<Boolean, List<Integer>> collect = list.stream()
                .collect(Collectors.groupingBy(s -> s >= n));

        System.out.println(reduce);
        System.out.println(collect);
    }
}
