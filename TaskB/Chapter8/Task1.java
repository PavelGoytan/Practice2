package TaskB.Chapter8;

import TaskB.Chapter3.Service.RandomSimbol;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(text);
        String sub = "SUB";
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher= pattern.matcher(text);
        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            int length = end-start;
            if(length>=3){
                String substring = text.substring(start, start + 3);
                stringBuilder.append(substring).append(sub).append(" ");
            } else {
                String substring = text.substring(start, end);
                stringBuilder.append(substring).append(" ");
            }

        }
        System.out.println(stringBuilder);
    }
}
