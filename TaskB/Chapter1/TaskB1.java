package TaskB.Chapter1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Вариант B
 * Ввести с консоли n целых чисел. На консоль вывести:
 * 1. Четные и нечетные числа.+
 * 2. Наибольшее и наименьшее число.+
 * 3. Числа, которые делятся на 3 или на 9.+
 * 4. Числа, которые делятся на 5 и на 7.+
 * 5. Все трехзначные числа, в десятичной записи которых нет одинаковых
 * цифр.+
 * 6. Простые числа.
 * 7. Отсортированные числа в порядке возрастания и убывания.+
 * 8. Числа в порядке убывания частоты встречаемости чисел.
 * 9. «Счастливые» числа.
 * 10. Числа-палиндромы, значения которых в прямом и обратном порядке совпа-
 * дают.
 * 11. Элементы, которые равны полусумме соседних элементов.
 */
public class TaskB1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        int[] arrayInt = new int[array.length];
        StringBuilder evenInt = new StringBuilder();
        StringBuilder oddInt = new StringBuilder();
        StringBuilder divideByThree = new StringBuilder();
        StringBuilder divideByFive = new StringBuilder();
        StringBuilder sortThree = new StringBuilder();
        StringBuilder sortSimple = new StringBuilder();
        int max = 0;
        int min;
        for (int j = 0; j < array.length; j++) {
            arrayInt[j] = Integer.parseInt(array[j]);
        }
        min = arrayInt[0];
        for (int j : arrayInt) {

            max = Math.max(max, j);
            min = Math.min(min, j);
            if (j % 2 == 0) {
                evenInt.append(j).append(" ");
            } else if (j % 2 > 0) {
                oddInt.append(j).append(" ");
            }
        }
        for (int j : arrayInt) {
            if (j % 3 == 0) {
                divideByThree.append(j).append(" ");
            } else if (j % 5 == 0 && j % 7 == 0) {
                divideByFive.append(j).append(" ");
            }
        }
        String num;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length()==3) {
                num = array[i];
                if (num.charAt(0) != num.charAt(1)
                        && num.charAt(1) != (num.charAt(2))
                        &&num.charAt(2) != (num.charAt(0))) {
                    sortThree.append(num).append(" ");
                }
            }
        }

        Arrays.sort(arrayInt);
        StringBuilder arrayIntRev = new StringBuilder();
        for (int i = arrayInt.length-1; i >= 0 ; i--) {
            arrayIntRev.append(String.valueOf(arrayInt[i])).append(" ");
        }
        System.out.println(arrayIntRev);
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(evenInt);
        System.out.println(oddInt);
        System.out.println(min);
        System.out.println(max);
        System.out.println(divideByThree);
        System.out.println(divideByFive);
        System.out.println(sortThree);


    }


}
