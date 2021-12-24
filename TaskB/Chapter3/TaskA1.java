package TaskB.Chapter3;

import TaskB.Chapter3.Students.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Создать классы, спецификации которых приведены ниже. Определить кон-
 * структоры и методы setТип(), getТип(), toString(). Определить дополнительно
 * методы в классе, создающем массив объектов. Задать критерий выбора данных
 * и вывести эти данные на консоль. В каждом классе, обладающем информацией,
 * должно быть объявлено несколько конструкторов.
 * 1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
 * Факультет, Курс, Группа.
 * Создать массив объектов. Вывести:
 * a) список студентов заданного факультета;
 * b) списки студентов для каждого факультета и курса;
 * c) список студентов, родившихся после заданного года;
 * d) список учебной группы.
 */
public class TaskA1 {
    public static void main(String[] args) {
//        MassivSt massivSt = new MassivSt(StudentsArray.createArray(30));
//        Random random = new Random();
//        int n = random.nextInt(30);
//        while (n!=10) {
//            System.out.println(massivSt.getArray()[n]);
//            n = random.nextInt(30);
//        }
        LocalDate deadLine = LocalDate.of(1985, 1,1);
        Student[] array = Student.arrayStudents(30);
        System.out.println(array[3].getId());
        List<Student> list = new ArrayList<>();
        for (Student student : array) {
            if (student.getDateOfBirth().compareTo(deadLine) > 0) {
                list.add(student);
            }
        }

        for (Student student : list) {
            System.out.println(student);
        }



    }


}
