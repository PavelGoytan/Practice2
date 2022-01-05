package TaskB.Chapter4.Four;

import java.time.LocalDate;

/**
 * Шеф-повар. Определить иерархию овощей. Сделать салат. Подсчитать ка-
 * лорийность. Провести сортировку овощей для салата на основе одного из
 * параметров. Найти овощи в салате, соответствующие заданному диапазону
 * калорийности.
 */
public class ChefSalatRun {
    public static void main(String[] args) {
        Tomatoes tomatoes = new Tomatoes("Tomat", LocalDate.now(),1.1);
        Salad salad = new Salad();
        salad.addVegetables(tomatoes);
        System.out.println(salad);


    }
}
