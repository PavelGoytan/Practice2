package TaskB.Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
//    private Scanner scanner;
    public static void sumMethod(Scanner scanner) {
        System.out.println("Введите количество чисел для сложения");
        int n = scanner.nextInt();
        int[] arrayInt = new int[n];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Введите число " + (1 + i));
            arrayInt[i] = scanner.nextInt();
        }
        int sum = Arrays.stream(arrayInt)
                .sum();
        System.out.println("Сумма введенных чисел: " + sum);
    }
}
