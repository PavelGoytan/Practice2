package TaskB.Chapter7;


/**
 * Написать функциональный интерфейс с методом, который принимает чис-
 * ло и возвращает булево значение. Написать реализацию такого интерфейса
 * в виде лямбда-выражения, которое возвращает true, если переданное число
 * делится без остатка на 13
 */
public class Task4Runner {
    public static void main(String[] args) {
        int b = 39;
        Task4 task4;
        task4 = a -> a % 13 == 0;
        boolean b1 = task4.dividedBy(b);
//        Task4 task4 = a -> a%13==0;
//        System.out.println(task4.dividedBy(b));
        System.out.println(b1);
        System.out.println(new Number().dividedBy(b));
        Task5 task5;
        task5 = (a, c) -> {
            if (a.length() > c.length())
                return a;
            else if (a.length() == c.length())
                return a + ".length() = " + c + ".length()";
            else return c;
        };
        String one = "Pavel";
        String two = "Aliek";
        System.out.println(task5.longer(one, two));
        Task6 task6;
        task6 = (x, y, z) -> y * y - 4 * x * z;
        double q = 3;
        double w = 4;
        double e = 5;
        double res = task6.discriminant(q,w,e);
        System.out.println(res);

    }
}
