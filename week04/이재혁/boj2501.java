package baekjoon;

import java.util.Scanner;

public class boj2501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                cnt += 1;
            }
            if (cnt == K) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }
}
