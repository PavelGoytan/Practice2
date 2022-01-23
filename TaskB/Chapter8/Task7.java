package TaskB.Chapter8;

/**
 * Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между
 * последовательностями подряд идущих букв оставить хотя бы один пробел.
 */
public class Task7 {
    public static void main(String[] args) {
        String text = "My! name? is; Pavel." +
                " I: am, thirty add three years old." +
                " I live in add Belarusian." +
                " I like to play add basketball";
        String s = text.replaceAll("\\p{Punct}", "").replaceAll(""," ");
        System.out.println(s);
    }
}
