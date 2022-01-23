package TaskB.Chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В зависимости от признака (0 или 1) в каждой строке текста удалить указан-
 * ный символ везде, где он встречается, или вставить его после k-гo символа.
 */
public class Task6 {
    public static void main(String[] args) {
        String text = "My name is Pavel." +
                " I am thirty three years old." +
                " I live in Belarusian." +
                " I like to play basketball";
        Random random = new Random();
        int i = 1;
        StringBuilder stringBuilder = new StringBuilder(text);
        Pattern pattern = Pattern.compile("l");
        Matcher matcher = pattern.matcher(stringBuilder);
        int e = 1;
        int count=0;
        List<Integer> list = new ArrayList<>();
        while (matcher.find()){
            int start = matcher.start();
            list.add(start-count);
            count++;
            stringBuilder.setCharAt(start,'#');
        }
        for (Integer integer : list) {
            stringBuilder.deleteCharAt(integer);
        }
        System.out.println(list.toString());
        System.out.println(count);
        System.out.println(stringBuilder);


        
        
    }
}
