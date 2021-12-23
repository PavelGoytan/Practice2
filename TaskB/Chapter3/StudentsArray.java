package TaskB.Chapter3;

import TaskB.Chapter3.Students.Student;

import java.time.LocalDate;

public class StudentsArray {


    public static   Object[] createArray(int n) {
        Object[] array = new Object[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=new Student(i+1,"Hgff"+i,"Adscs"+i,"Aqwqe"+i,"Pasdsd 40"+i
                    ,"SA","1","1AS2", "37529316039"+i, LocalDate.of(1988,12,13));
            System.out.println(array[i].toString());
        }
        return array;
    }

}

