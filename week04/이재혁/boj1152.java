package baekjoon;

import java.util.Scanner;

public class boj1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine().trim();

        char[] arr = s.toCharArray();

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                cnt += 1;
            }
        }

        if (s.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(cnt+1);
        }

    }
}
