package baekjoon;

import java.util.Scanner;

public class boj10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (m == arr[i]) {
                cnt+=1;
            }
        }

        System.out.println(cnt);


    }
}
