package TaskB.Chapter4.First;

import java.util.Objects;

public class Text {
    private String str;

    public Text() {
    }

    public Text(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(str, text.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }


    public String addSentence(Sentence sentence) {
        return this.str = str + " " + sentence.toString();
    }

    public String addWord(Word word) {
        return this.str = str + " " + word.toString();
    }


    public void printText(Text text) {
        System.out.println(text);
    }

    public String titleText(String title) {
        return this.str = title + "\n" + str;
    }

    @Override
    public String toString() {
        return str;
    }
}
