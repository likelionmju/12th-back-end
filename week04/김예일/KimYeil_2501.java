package week04;

import java.util.Scanner;

public class KimYeil_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] divisor = new int[9999];

        int num = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0)
                divisor[num++] = i;
        }
        System.out.println(divisor[n2 - 1]);
    }
}
