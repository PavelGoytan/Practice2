package TaskB.Chapter8;

import TaskB.Chapter7.Repitition;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Определить, сколько раз повторяется в тексте каждое слово, которое встре-
 * чается в нем
 */
public class Task9 {
    public static void main(String[] args) {
        String text = "My! name? is; Pavel." +
                " I: am, thirty add three years old." +
                " I live in add Belarusian." +
                " I like to play add basketball";
        String[] q = text.replaceAll("\\p{Punct}", "").split(" ");
        String[] strings1 = Arrays.stream(q)
                .sorted()
                .toArray(String[]::new);
        Repitition repitition;
        repitition = text1 -> {
            String[] rep = new String[text1.length];
            String lastEl = null;
            int count = 0;
            int index = 0;
            for (int i = 0; i < text1.length; i++) {
                if (lastEl == null) {
                    lastEl = text1[i];
                    count = 1;
                    continue;
                }
                if (!text1[i].equals(lastEl)) {
                    rep[index] = lastEl + "-" + count;
                    index++;
                    lastEl = text1[i];
                    count = 1;
                } else count++;
                if (i == text1.length - 1) {
                    rep[index] = lastEl + "-" + count;
                }

            }
            int counter = 0;
            int index2 = 0;
            for (String s : rep) {
                if (s != null) {
                    counter++;
                }
            }
            String[] result = new String[counter];
            for (String s : rep) {
                if (s != null) {
                    result[index2] = s;
                    index2++;
                }
            }


            return result;

        };
        String[] strings = repitition.howMachRepit(strings1);
        System.out.println(Arrays.toString(strings));

    }
}
