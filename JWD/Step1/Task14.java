package JWD.Step1;

import java.util.Scanner;

/**
 * Для данных областей составить линейную программу, которая печатает true,
 * если точка с координатами (х, у) принадлежит закрашенной области, и false — в
 * противном случае:
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
//        int x=4;
//        int y=3;
//        if(x>=-4&&x<=4&&y<=0&&y>=-3||x>=-2&&x<=2&&y>=0&&y<=4){
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
        System.out.println(x >= -4 && x <= 4 && y <= 0 && y >= -3 || x >= -2 && x <= 2 && y >= 0 && y <= 4);

    }
}
