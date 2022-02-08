package JWD.Step1;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения):
 */
public class Task12 {
    public static void main(String[] args) {
        double a = -3;
        double b = 3;
        double c = -3;
        double result;
        if (a != 0 && a * c >= 0 && b != 0) {
            result = (b + sqrt(pow(b, 2) + 4 * c * a)) / (2 * a) - pow(a, 3) * c + pow(b, -2);
            System.out.println(result);

        } else {
            System.out.println("Нет решения");
        }
    }
}
