package TaskB.Chapter1;

import java.util.Random;

/**
 * 3. Вывести заданное количество случайных чисел с переходом и без перехода
 * на новую строку.
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
