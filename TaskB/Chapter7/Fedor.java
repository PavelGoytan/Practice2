package TaskB.Chapter7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fedor {
    public static void fedorInString(Scanner scanner) {
        String line = scanner.nextLine();
        List<String> collect = Arrays.stream(line.split(" "))
                .filter(string -> string.contains("fedor"))
                .collect(Collectors.toList());
        System.out.println(collect.toString());
    }
}
