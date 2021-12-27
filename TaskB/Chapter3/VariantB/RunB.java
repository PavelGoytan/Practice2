package TaskB.Chapter3.VariantB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunB {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        List<String> list = new ArrayList<>();
        TaskB1[] array = new TaskB1[sizeArray];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Initialize arrra[" + i + "]");
            array[i] = new TaskB1(scanner.nextInt(), scanner.nextInt());
        }
        for (TaskB1 b1 : array) {
            list.add("{" + b1.getM() + "/" + b1.getN() + "}");
        }
        System.out.println(list);
    }
}
