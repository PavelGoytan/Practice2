package JWD.Step1;

/**
 * Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
 * Сумма двух первых цифр заданного четырехзначного числа
 * равна сумме двух его последних цифр.
 */
public class Task11 {
    public static void main(String[] args) {
        int n = 5234;
        int[] array = new int[4];
        for (int i = 3; i >=0; i--) {
            array[i] = n%10;
            n /= 10;
        }
        System.out.println((array[0]+array[1])==(array[2]+array[3]));
    }
}
