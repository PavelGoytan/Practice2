package TaskB.Chapter7;

import TaskB.Chapter3.Service.RandomSimbol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Написать класс Пользователь с полями: id, имя, возраст, страна. Создать
 * массив Пользователей. Отсортировать по стране и возрасту. Выбрать всех
 * Пользователей старше заданного возраста, первая буква имени у которых
 * начинается с заданной буквы. Получить максимальный и минимальный
 * элемент в сгруппированном результате по возрасту.
 */
public class Task3 {
    public static void main(String[] args) {
        int amount = 100;
        User[] users = new User[amount];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(i+1,RandomSimbol.name(),RandomSimbol.age(),RandomSimbol.country());
            System.out.println(users[i].toString());
        }
        System.out.println("----------------------------------");
        List<User> collect = Arrays.stream(users)
                .sorted(Comparator.comparing(User::getCountry).thenComparing(User::getAge))
                .filter(user -> user.getAge()>18&&user.getName().charAt(0)=='A')
                .collect(Collectors.toList());

        for (User user : collect) {
            System.out.println(user);
        }
        System.out.println("----------------------------------");
        User userMax = collect.stream()
                .max(Comparator.comparing(User::getAge))
                .get();
        User userMin = collect.stream()
                .min(Comparator.comparing(User::getAge))
                .get();

        System.out.println(userMax+"\n"+userMin);

    }

}
