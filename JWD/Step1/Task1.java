package JWD.Step1;

import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task1 {
    public static void main(String[] args) {
        sumOfDigits(123); //#1

        double v = resultOfExpression(1, 4, 3);//#2
        System.out.println(v);

        double perimeter = perimeterOfTriangle(2, 4);//#3
        double area = areaOfTriangle(2, 4);//#3

        boolean inRange = isInRange(4, -3);//#4
        System.out.println(inRange);

        threeNumbers(2, -3, -4);//#5

        int sumMinMax = sumMinMax(11, 3, 14);//#6
        System.out.println(sumMinMax);

        valuesTable(1, 14, 2);//#7

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumMultiple(a, 2);//#8
        System.out.println(sum);

        int[] b = {11, 12, 13};
        int[] sumOfTwoArray = sumOfTwoArray(a, b, 3);//#9
        System.out.println(Arrays.toString(sumOfTwoArray));

        int[][] arraySquare = arraySquare(4);//#10

    }

    /**
     * #1
     * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
     * Сумма двух первых цифр заданного четырехзначного числа
     * равна сумме двух его последних цифр.
     */
    public static void sumOfDigits(int number) {
        if (number <= 9999 && number >= 1000) {
            int[] array = new int[4];
            for (int i = 3; i >= 0; i--) {
                array[i] = number % 10;
                number /= 10;
            }
            System.out.println((array[0] + array[1]) == (array[2] + array[3]));
        } else {
            System.out.println("Не корректное число!");
        }

    }

    /**
     * #2
     * Вычислить значение выражения по формуле (все переменные принимают
     * действительные значения):
     */
    public static double resultOfExpression(double a, double b, double c) {
        double result = 0;
        if (a != 0 && a * c >= 0 && b != 0) {
            result = (b + sqrt(pow(b, 2) + 4 * c * a)) / (2 * a) - pow(a, 3) * c + pow(b, -2);
        } else {
            System.out.println("Нет решения");
        }
        return result;
    }

    /**
     * #3
     * Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
     * двух катетов.
     */
    public static double perimeterOfTriangle(double a, double b) {
        double perimeter = 0;
        if (a > 0 && b > 0) {
            perimeter = Math.sqrt(a * a + b * b) + a + b;
            System.out.println("Периметр треугольника с катетами: " + a + " и " + b + " равен " + perimeter);
        } else {
            System.out.println("Катеты отрицательные");
        }
        return perimeter;

    }

    public static double areaOfTriangle(double a, double b) {
        double area = 0;
        if (a > 0 && b > 0) {
            area = a * b;
            System.out.println("Площадь треугольника с катетами: " + a + " и " + b + " равна " + area);
        } else {
            System.out.println("Катеты отрицательные");
        }
        return area;
    }

    /**
     * #4
     * Для данных областей составить линейную программу, которая печатает true,
     * если точка с координатами (х, у) принадлежит закрашенной области, и false — в
     * противном случае:
     */
    public static boolean isInRange(int x, int y) {
        return x >= -4 && x <= 4 && y <= 0 && y >= -3 || x >= -2 && x <= 2 && y >= 0 && y <= 4;
    }

    /**
     * #5
     * Даны три действительных числа. Возвести в квадрат те из них, значения
     * которых неотрицательны, и в четвертую степень — отрицательные.
     */
    public static void threeNumbers(double a, double b, double c) {
        double[] array = {a, b, c};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                array[i] *= array[i];

            } else if (array[i] < 0) {
                array[i] = Math.pow(array[i], 4);

            }
            a = array[0];
            b = array[1];
            c = array[2];
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }

    }

    /**
     * #6
     * Написать программу нахождения суммы большего и меньшего из трех чисел.
     */
    public static int sumMinMax(int a, int b, int c) {
        int[] array = {a, b, c};
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
        return max + min;
    }

    /**
     * #7
     * Составить программу вычисления значений функции F(x) на отрезке [а, b] с
     * шагом h. Результат представить в виде таблицы, первый столбец которой –
     * значения аргумента, второй - соответствующие значения функции:
     */
    public static void valuesTable(double a, double b, double h) {
        double y;
        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|%n", "x", "y");
        System.out.println("-------------------------");
        for (double x = a; x <= b; x = x + h) {
            y = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
            System.out.println("-------------------------");
        }
    }

    /**
     * #8
     * В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
     * которые кратны данному К.
     */
    public static int sumMultiple(int[] a, int k) {
        int sum = 0;
        for (int j : a) {
            if (j % k == 0) {
                sum += j;
            }
        }
        return sum;
    }

    /**
     * #9
     * Заданы два одномерных массива с различным количеством элементов и
     * натуральное число k. Объединить их в один массив, включив второй массив
     * между k-м и (k+1) - м элементами первого.
     */
    public static int[] sumOfTwoArray(int[] a, int[] b, int k) {
        int[] c = new int[a.length + b.length];
        if (k <= a.length) {
            for (int i = 0; i < c.length; i++) {
                if (i <= k - 1) {
                    c[i] = a[i];
                } else if (i <= k - 1 + b.length) {
                    c[i] = b[i - k];
                } else {
                    c[i] = a[i - b.length];
                }
            }
        } else {
            System.out.println(" k за пределами массива");
        }

        return c;
    }

    /**
     * #10
     * Сформировать квадратную матрицу порядка n по заданному образцу(n -
     * четное):
     */
    public static int[][] arraySquare(int n) {
        int[][] array = new int[n][n];
        int c = n;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        array[i][j] = j + 1;
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        array[i][j] = c;
                        c--;
                    }
                    c = n;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println();
                for (int j = 0; j < n; j++) {

                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("n должно быть четное");
        }
        return array;
    }

}





