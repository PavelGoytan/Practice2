package TaskB.Chapter1;

import java.util.Scanner;

/**
 * 5. Ввести целые числа как аргументы командной строки, подсчитать их сум-
 * мы и произведения. Вывести результат на консоль.
 */
public class TaskA5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        int sum=0;
        int mul=1;
        int[] arrayInt = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }
        for (int j : arrayInt) {
            sum += j;
            mul *= j;
        }
        System.out.println("summa: " + sum + "; mul: " + mul);
    }
}
