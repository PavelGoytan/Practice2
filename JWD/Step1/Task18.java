package JWD.Step1;

/**
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
 * которые кратны данному К.
 */
public class Task18 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int sum = 0;
        int k = 3;
        for (int j : a) {
            if (j % k == 0) {
                System.out.println(j);
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
