package TaskB.Chapter3.Students;

import java.time.LocalDate;

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
    private int id;
    private String lastName;
    private String firstName;
    private String thirdName;
    private String address;
    private String fac;
    private String curse;
    private String group;
    private String phoneNumber;
    private LocalDate dateOfBirth;

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


    public void setId(int id) {
        this.id = id;
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
