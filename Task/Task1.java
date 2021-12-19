package Task;

import java.util.Scanner;

/**
 * A. Реализуйте статические методы ввода и простого/форматного вывода для одномерных
 * массивов типа double. Разместите эти методы в классе by.it.familiya.jd01_03.InOut
 * 
 * Сигнатура для ввода:
 * static double[ ] getArray(String line)
 * 
 * Сигнатуры для вывода: static void printArray(double[ ] array) (используйте System.out.print)
 * 
 * ( а тут printf ) static void printArray(double[ ] array, String name, int columnCount)
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        double[] array = getArray(line);
        System.out.println(array[1]);
        printArray(array);
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }


    private static double[] getArray(String line) {
        String[] lineArray = line.split(" ");
        double[] doubles = new double[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            doubles[i] = Double.parseDouble(lineArray[i]);
        }
        return doubles;
    }
}
