package TaskB.Chapter1;

import java.util.Random;

/**
 * 3. Вывести заданное количество случайных чисел с переходом и без перехода
 * на новую строку.
 * 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
 * 5. Ввести целые числа как аргументы командной строки, подсчитать их сум-
 * мы и произведения. Вывести результат на консоль.
 * 6. Вывести фамилию разработчика, дату и время получения задания, а также
 * дату и время сдачи задания.
 */

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = 10;
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = random.nextInt();
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int j : array) {
            System.out.println(j);
        }
    }
}
