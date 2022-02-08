package JWD.Step1;

/**
 * Написать программу нахождения суммы большего и меньшего из трех чисел.
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = {11, 4, 9};
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        int sum = max + min;
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);

    }
}
