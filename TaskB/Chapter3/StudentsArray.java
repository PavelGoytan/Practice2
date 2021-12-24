package TaskB.Chapter3;

import TaskB.Chapter3.Students.Student;

import java.time.LocalDate;
import java.util.Random;

public class StudentsArray {


    public static   Object[] createArray(int n) {
        Object[] array = new Object[n];
        Random random = new Random();
        int m = random.nextInt(10);
        for (int i = 0; i < array.length; i++) {
            array[i]=new Student(i+1,"Hgff"+i,"Adscs"+i,"Aqwqe"+i,"Pasdsd 40"+i
                    ,"SA","1","1AS2", "3752931603"+i, LocalDate.of(1980+m,12,13));
            System.out.println(array[i].toString());
            m = random.nextInt(10);
        }
        return array;
    }

}

