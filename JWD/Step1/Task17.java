package JWD.Step1;

/**
 * Составить программу вычисления значений функции F(x) на отрезке [а, b] с
 * шагом h. Результат представить в виде таблицы, первый столбец которой –
 * значения аргумента, второй - соответствующие значения функции:
 */
public class Task17 {
    public static void main(String[] args) {
        int a = 1;
        int b = 14;
        int h = 2;
        int k = (b - a) / h;
        double[] arrayX = new double[k + 1];
        double[] arrayF = new double[k + 1];
        for (int i = 0; i <= k; i++) {
            arrayX[i] = a;
//            System.out.println(arrayX[i]);
            arrayF[i] = Math.pow(Math.sin(arrayX[i]), 2) - Math.cos(2 * arrayX[i]);
//            System.out.println(arrayF[i]);
            System.out.printf("%-7.1f%-7.4f%n", arrayX[i], arrayF[i]);
            a += h;
        }
    }
}
