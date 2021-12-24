package TaskB.Chapter3.Students;

import java.time.LocalDate;

import java.util.Random;

/**
 * 1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
 * Факультет, Курс, Группа.
 * Создать массив объектов. Вывести:
 * a) список студентов заданного факультета;
 * b) списки студентов для каждого факультета и курса;
 * c) список студентов, родившихся после заданного года;
 * d) список учебной группы.
 */
public class Student {
    private final int id;
    private final String lastName;
    private final String firstName;
    private final String thirdName;
    private final String address;
    private final String fac;
    private final String curse;
    private final String group;
    private final String phoneNumber;
    private final LocalDate dateOfBirth;

    public Student(int id,
                   String lastName,
                   String firstName,
                   String thirdName,
                   String address,
                   String fac,
                   String curse,
                   String group,
                   String phoneNumber,
                   LocalDate dateOfBirth) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.thirdName = thirdName;
        this.address = address;
        this.fac = fac;
        this.curse = curse;
        this.group = group;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public static Student[] arrayStudents(int b){
        Random random = new Random();
        int m = random.nextInt(10);
        Student[] arrayStudents = new Student[b];
        for (int i = 0; i < arrayStudents.length; i++) {
            arrayStudents[i] = new Student(i+1,"Pavel"+i, "Hoitan"+i,
                    "Vladimirovich"+i,"Pavlovsskogo st. "+i,"BF",
                    "1","4294B","+37529316039"+i,LocalDate.of(1980+m,12,13));
            System.out.println(arrayStudents[i].toString());
            m = random.nextInt(10);
        } return arrayStudents;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", address='" + address + '\'' +
                ", fac='" + fac + '\'' +
                ", curse='" + curse + '\'' +
                ", group='" + group + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
