package TaskB.Chapter8;

import java.util.Arrays;

/**
 * В тексте найти и напечатать n символов (и их количество), встречающихся
 * наиболее часто.
 */
public class Task10 {
    public static void main(String[] args) {
        String text = "My! name? is; Pavel." +
                " I: am, thirty add three years old." +
                " I live in add Belarusian." +
                " I like to play add basketball";
        String[] symbol = text.replaceAll("\\W", "").split("");
        String[] strings = Arrays.stream(symbol)
                .map(String::toLowerCase)
                .sorted()
                .toArray(String[]::new);
        long lengthArray = Arrays.stream(symbol)
                .map(String::toLowerCase)
                .distinct()
                .count();
        String[] strings1 = Arrays.stream(symbol)
                .map(String::toLowerCase)
                .distinct()
                .toArray(String[]::new);
        String[] result = new String[(int) lengthArray];
        boolean n  = true;
        int count=0;
        int index = 0;
        String m = "";
        for (int i = 0; i < strings.length; i++) {
            if(i==0){
                count++;
                m+=strings[i];
            } else if(m.equals(strings[i])&&i!= strings.length-1){
                count++;
            } else if(i== strings.length-1) {
                count++;
                result[index] = m + "-" + count;

            } else {
                result[index] = m + "-" + count;
                index++;
                count=1;
                m=strings[i];
            }
        }
        for (String string : strings) {
            System.out.print(string);
        }
        System.out.println();
        for (String s : result) {
            System.out.print(s+" ;");
        }
        System.out.println();
        for (String s : strings1) {
            System.out.print(s);
        }
    }
}
