package JWD.Step1;

/**
 * Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
 * двух катетов.
 */
public class Task13 {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double perimeter = Math.sqrt(a * a + b * b) + a + b;
        double square = a * b;
        System.out.println("Периметр треугольника: " + perimeter);
        System.out.println("Площадь треугольника: " + square);
    }
}
