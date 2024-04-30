package baekjoon;

import java.util.Scanner;

public class boj2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int num3;
        int num4;
        int num5;

        int num6;


        num3 = (num2 % 10) * num1;
        num4 = (((num2 % 100) / 10)) * num1;
        num5 = (num2 / 100) * num1;

        num6 = num3 + num4*10 + num5*100;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

    }
}
