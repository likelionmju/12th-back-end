package baekjoon;

import java.util.Scanner;

public class boj10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = -100000000;
        int min = 10000000;

        for (int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            if (tmp > max) {
                max = tmp;
            }
            if (min > tmp) {
                min = tmp;
            }
        }

        System.out.println(min + " " + max);

    }
}
