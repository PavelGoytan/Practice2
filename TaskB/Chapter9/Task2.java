package TaskB.Chapter9;

import java.util.ArrayList;
import java.util.List;

/**
 * Ввести число, занести его цифры в стек. Вывести число, у которого цифры
 * идут в обратном порядке.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = 123456789;
        List<Integer> list = new ArrayList<>();
       while (a!=0){
           list.add(a%10);
           a=a/10;
       }
        for (Integer integer : list) {
            System.out.print(integer);
        }
    }
}
