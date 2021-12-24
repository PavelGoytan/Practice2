package TaskB.Chapter3.Service;

import java.util.Random;

public class RandomSimbol {
    private static String array = "ABCDEFJHIJKLMNOPQRSTUVWXYZ"; //26
    public static char firstChar (){
        Random random = new Random();
        int k = random.nextInt(26);
        char firstChar=' ';
        for (int i = 0; i < array.length()-1; i++) {
            firstChar = array.charAt(k);

        }
        return firstChar;
    }
}
