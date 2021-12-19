package TaskB.Chapter1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 6. Вывести фамилию разработчика, дату и время получения задания, а также
 * дату и время сдачи задания.
 */
public class TaskA6 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm.ss");
        String stringTime = dateTimeFormatter.format(localDateTime);
        System.out.println("Enter last name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Date and time start: " + stringTime);
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LocalDateTime localDateTime2 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm.ss");
        String stringTime2 = dateTimeFormatter2.format(localDateTime2);
        System.out.println("Date and time stop: " + stringTime2);
    }
}
