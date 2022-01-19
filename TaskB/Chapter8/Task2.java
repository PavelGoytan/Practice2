package TaskB.Chapter8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * В тексте каждую букву заменить ее порядковым номером в алфавите. При
 * выводе в одной строке печатать текст с двумя пробелами между буквами,
 * в следующей строке внизу под каждой буквой печатать ее номер.
 */
public class Task2 {
    public static void main(String[] args) {
        String array = "ABCDEFJHIJKLMNOPQRSTUVWXYZ";
        char[] chars1 = array.toLowerCase().toCharArray();
        String text = "My name is Pavel. I am thirty three years old." +
                " I live in Belarusian." +
                " I like to play basketball";
        char[] chars = text.replaceAll("[\\p{Punct}]","")
                .replaceAll("[\\p{Space}]","")
                .toLowerCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            stringBuilder.append(aChar).append("  ");
        }
        stringBuilder.append("\n");
        for (char aChar : chars) {
                for (int j = 0; j < chars1.length; j++) {
                    if (aChar == chars1[j]) {
                        stringBuilder.append(j+1);
                        if(j<10){
                            stringBuilder.append("  ");
                        } else {
                            stringBuilder.append(" ");
                        }
                    }
                }
            }
        System.out.println(chars.length);
        System.out.println(stringBuilder);
    }

    }

