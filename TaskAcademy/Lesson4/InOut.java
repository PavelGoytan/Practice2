package TaskAcademy.Lesson4;

/**
 * Реализуйте статические методы ввода и простого/форматного вывода для одномерных
 * массивов типа double. Разместите эти методы в классе by.it.familiya.jd01_03.InOut
 * Сигнатура для ввода:
 * static double[ ] getArray(String line)
 * Сигнатуры для вывода: static void printArray(double[ ] array) (используйте System.out.print)
 * ( а тут printf ) static void printArray(double[ ] array, String name, int columnCount)
 */
public class InOut {
    static double[] getArray(String line){
        String[] s = line.split(" ");
        double[] d = new double[s.length];
        for (int i = 0; i < s.length; i++) {
            d[i]=Double.parseDouble(s[i]);
        }
        return d;
    }

}
