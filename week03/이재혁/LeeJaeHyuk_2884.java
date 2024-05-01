package baekjoon;

import java.util.Scanner;

public class boj2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        int M2 = M - 45;

        if (M2 < 0) {
            int H2 = H -1;
            if (H2 < 0) {
                int H3 = H2 + 24;
                M2 += 60;
                System.out.println(H3 + " " + M2);
            } else {
                M2 += 60;
                System.out.println(H2 + " " + M2);
            }
        } else {
            System.out.println(H + " " + M2);
        }
    }
}
