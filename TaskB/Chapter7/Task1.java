package TaskB.Chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * С помощью каррирования реализовать функцию сложения двух чисел,
 * функцию проверки строки на регулярное выражение, функцию разбиения
 * строки по регулярному выражению.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sum.sumMethod(scanner);
        Scanner sc = new Scanner(System.in);
        Fedor.fedorInString(sc);
//        sumMethod(scanner);
//        fedorInString(scanner);
    }




}
