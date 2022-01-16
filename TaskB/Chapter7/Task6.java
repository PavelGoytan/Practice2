package TaskB.Chapter7;

/**
 * Написать функциональный интерфейс с методом, который принимает три
 * дробных числа: a, b, c и возвращает тоже дробное число. Написать реализа-
 * цию такого интерфейса в виде лямбда-выражения, которое возвращает дис-
 * криминант.
 */
@FunctionalInterface
public interface Task6 {
    double discriminant(double x,double y,double z);
}
