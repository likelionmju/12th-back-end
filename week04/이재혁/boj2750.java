package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class boj2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int tmp;

        for (int i = 0; i < n; i++) {
            tmp = scanner.nextInt();
            arr[i] = tmp;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
