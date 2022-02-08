package JWD.Step1;

/**
 * Даны три действительных числа. Возвести в квадрат те из них, значения
 * которых неотрицательны, и в четвертую степень — отрицательные.
 */
public class Task15 {
    public static void main(String[] args) {
//        double a = 1;
//        double b = 2;
//        double c = -3;
        double[] array = {1, -2, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                array[i] *= array[i];
                System.out.println(array[i]);
            } else if (array[i] < 0) {
                array[i] = Math.pow(array[i], 4);
                System.out.println(array[i]);
            }
        }
    }
}
