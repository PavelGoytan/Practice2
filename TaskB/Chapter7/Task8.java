package TaskB.Chapter7;

import java.util.Arrays;


/**
 * Вывести количество вхождений заданного слова в тексте соответственно
 * из файла в виде [слово1-2, слово2-3, слово3-0].
 */
public class Task8 {
    public static void main(String[] args) {
        String text = "Dog, Cat, Fish, Dog, Cat, Dog, kit, kit, mouse, Cat, Fish, Dog, mouse";
        String[] strings = text.replaceAll(",", "").split(" ");
        String[] strings1 = Arrays.stream(strings)
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
        String[] strings2 = repitition.howMachRepit(strings1);
        System.out.println(Arrays.toString(strings2));
    }
}
