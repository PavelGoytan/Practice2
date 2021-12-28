package TaskB.Chapter4.First;

public class Sentence {
    private String sentence;

    public Sentence() {
    }

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return sentence;
    }
}
