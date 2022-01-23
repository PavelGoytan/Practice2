package TaskB.Chapter8;

import TaskB.Chapter3.Service.RandomSimbol;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * В каждом слове текста k-ю букву заменить заданным символом. Если
 * k больше длины слова, корректировку не выполнять.
 */
public class Task1 {
    public static void main(String[] args) {
        char c = RandomSimbol.firstChar();
        Random random = new Random();
        int i = random.nextInt(4);
        String text = "My name is Pavel. I am thirty three years old. I live in Belarusian. I like to play basketball!";
        StringBuilder stringBuilder = new StringBuilder(text);
//        stringBuilder.append(text);
        String sub = "SUB";
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(stringBuilder);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            int length = end - start;
            if (length >= 3) {
                stringBuilder.replace(start+2,end,sub);
//                String substring = text.substring(start, start + 3);
//                stringBuilder.append(substring).append(sub).append(" ");
//            } else {
//                String substring = text.substring(start, end);
//                stringBuilder.append(substring).append(" ");
            }

        }
        System.out.println(stringBuilder);
        String[] strings = text.split(" ");
        List<String> collect = Arrays.stream(strings)
                .map(s -> (s.length() >= 3&&s.endsWith("."))
                        ? (s.substring(0, 2) + sub + s.substring(s.length() - 1)) : s)
                .map(s -> (s.length() >= 3&&s.endsWith("!"))
                        ? (s.substring(0, 2) + sub + s.substring(s.length() - 1)) : s)
                .map(s -> (s.length() >= 3&&!s.contains(sub))
                        ? (s.substring(0, 2) + sub) : s)
//                .map(s -> (s.length()>=3&&!s.endsWith("."))?(s.substring(0,s.length()-1)):s)
                .collect(Collectors.toList());
        String string = collect.toString();

        System.out.println(string.replaceAll(",",""));

    }

}
