package TaskB.Chapter1;

import java.util.Scanner;

/**
 * 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
 */
public class Task4 {
    public static void main(String[] args) {
        String pas = "123456AB";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
        boolean n = false;
        do {
            String password = scanner.nextLine();
            if(password.equals(pas)){
                n=true;
            } else {
                System.out.println("password is false");
            }
        } while (!n);
        System.out.println("password is true");
    }
}
