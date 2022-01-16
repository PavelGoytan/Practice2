package TaskB.Chapter7;
/**
 * Вывести количество вхождений заданного слова в тексте соответственно
 * из файла в виде [слово1-2, слово2-3, слово3-0].
 */
@FunctionalInterface
public interface Repitition {
    String[] howMachRepit(String[] text);
}
