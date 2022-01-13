package TaskB.Chapter3.Service;

import java.util.Random;

public class RandomSimbol {
    private static final String array = "ABCDEFJHIJKLMNOPQRSTUVWXYZ";//26
    private static final String arrayF = "ABCD";//4
    private static final String[] countryArray = {"USA", "France","Russia","China"};

    public  static int age(){
        Random random = new Random();
        return random.nextInt(18,38);
    }
    public static String country(){
        Random random = new Random();
        int k = random.nextInt(countryArray.length);
        return countryArray[k];
    }

    public static char firstChar (){
        Random random = new Random();
        int k = random.nextInt(26);
        char firstChar=' ';
        for (int i = 0; i < array.length()-1; i++) {
            firstChar = array.charAt(k);

        }
        return firstChar;
    }
    public static char facChar (){
        Random random = new Random();
        int k = random.nextInt(4);
        char firstChar=' ';
        for (int i = 0; i < arrayF.length()-1; i++) {
            firstChar = array.charAt(k);

        }
        return firstChar;
    }
    public static String name(){
        Random random = new Random();
        int stringLength = random.nextInt(5,8);
        String name = "";
        for (int i = 0; i < stringLength; i++) {
            name+= firstChar();
        } return name;
    }
}
