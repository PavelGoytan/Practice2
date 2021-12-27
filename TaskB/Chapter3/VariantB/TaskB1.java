package TaskB.Chapter3.VariantB;

/**
 * Реализовать методы сложения, вычитания, умножения и деления объектов (для
 * тех классов, объекты которых могут поддерживать арифметические действия).
 * 1. Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
 * Объявить и инициализировать массив из k дробей, ввести/вывести значе-
 * ния для массива дробей. Создать массив/список/множество объектов и пе-
 * редать его в метод, который изменяет каждый элемент массива с четным
 * индексом путем добавления следующего за ним элемента.
 */
public class TaskB1 {
    private int m;
    private int n;

    public TaskB1(int m, int n) {
        this.m = m;
        this.n = n;
        if (n == 0) {
            System.out.println("Devide by ZERO");
        } else {
            double k =(double) m / n;
            System.out.println(k);
        }
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    @Override
    public String toString() {
        return m + "/" + n;
    }
}
