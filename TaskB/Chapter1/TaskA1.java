package TaskB.Chapter1;

import java.util.Scanner;

/**
 * 1. Приветствовать любого пользователя при вводе его имени через команд-
 * ную строку.
 */
public class TaskA1 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     boolean n = false;
     while (!n) {
         String person = scanner.nextLine();
         System.out.println("Hello " + person);
         if(person.equals("end")){
             n=true;
         }
     }
    }


}
