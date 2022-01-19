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
        String text = "My name is Pavel. I am thirty three years old. I live in Belarusian. I like to play basketball";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text);
        Pattern pattern = Pattern.compile("[a-zA-Z]{4,}");
        Matcher matcher= pattern.matcher(stringBuilder);
        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            int length = end-start;
            if(length>=i){
                stringBuilder.setCharAt(start+i,c);
            }

        }
        System.out.println(stringBuilder);
    }
}
