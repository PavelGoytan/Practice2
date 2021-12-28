package TaskB.Chapter4.First;

public class RunFirst {
    public static void main(String[] args) {
        Text text = new Text();
        Word word = new Word();
        Sentence sentence = new Sentence();
        text.setStr("When poverty show itself");
        System.out.println(text);
        word.setWord("even");
        text.addWord(word);
        System.out.println(text);
        sentence.setSentence("mischievous boys understand");
        text.addSentence(sentence);
        System.out.println(text);
        text.titleText("THE ADVENTURES");
        System.out.println(text);
        word.setWord("end");
        text.addWord(word);
        System.out.println(text);
        Text text1 = new Text(word,sentence);
        text1.printText(text1);



    }
}
