package week03;

import java.util.Scanner;

public class LeeBeomjin_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int hun = second/100;
        int ten = second%100/10;
        int one = second%10;

        System.out.println(first*one); //1의자리 곱셈
        System.out.println(first*ten); // 10의자리 곱셈
        System.out.println(first*hun);
        System.out.println(first*second);
    }
}
