package TaskAcademy.Lesson4;

import java.util.Scanner;

/**
 * B1. Введите с консоли число людей n (nextInt() в сканере).
 * Затем введите одномерный массив их фамилий (next() в сканере).
 * Введите двумерный массив их зарплат за 4 квартала (N строк и 4 столбца).
 * Зарплаты имеют тип int.
 * Нужно для каждой фамилии выводить подсказку
 * После подсказки можно через пробел вводить с консоли 4 цифры зарплат по кварталам (nextInt() в
 * сканере).
 * Постройте в консоли таблицу доходов людей по кварталам с фамилиями и
 * итогом за год в последней колонке.
 * B2. Посчитайте и выведите общую сумму всех выплат и среднеарифметическую
 * квартальную зарплату с точностью как минимум до 4-го знака .
 */
public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of people");
        int numberOfPeople = scanner.nextInt();
        String[] lastName = new String[numberOfPeople];
        System.out.println("Enter last name of 1 person");
        for (int i = 0; i < lastName.length; i++) {
            lastName[i] = scanner.next();
            System.out.println("Enter last name of " + (i + 2) + " person");
        }
        for (String s : lastName) {
            System.out.println(s);
        }
        System.out.println("Enter the salary");
        int[][] salaryForQ = new int[numberOfPeople][4];
        int[] sum = new int[numberOfPeople];
        for (int i = 0; i < lastName.length; i++) {
            System.out.print("Salary " + lastName[i] + " person ");
            for (int j = 0; j < salaryForQ[i].length; j++) {
                System.out.print(" for " + (j + 1) + " quartile: ");
                salaryForQ[i][j] = scanner.nextInt();
                sum[i] += salaryForQ[i][j];
            }
        }
        System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s%n", "Last name", "Quartile 1"
                , "Quartile 2"
                , "Quartile 3"
                , "Quartile 4"
                , "Total");
        for (int i = 0; i < lastName.length; i++) {
            System.out.printf("%-12s%-12d%-12d%-12d%-12d%-12d%n", lastName[i]
                    , salaryForQ[i][0]
                    , salaryForQ[i][1]
                    , salaryForQ[i][2]
                    , salaryForQ[i][3]
                    , sum[i]);
        }

    }
}
