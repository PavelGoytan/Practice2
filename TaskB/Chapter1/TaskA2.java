package TaskB.Chapter1;

import java.util.Scanner;

/**
 * 2. Отобразить в окне консоли аргументы командной строки в обратном по-
 * рядке.
 */
public class TaskA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder enil = new StringBuilder();
        for (int i = line.length()-1; i >=0; i--) {
            enil.append(line.charAt(i));
        }
        System.out.println(enil);
    }
}
