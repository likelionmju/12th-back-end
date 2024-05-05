package baekjoon;

import java.util.Scanner;

public class boj10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] arr = s.toCharArray();

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < alphabet.length; i++) {
            int cnt = -1;
            for (int j = 0; j < arr.length; j++) {
                if (alphabet[i] == arr[j]) {
                    cnt = j;
                }
                if (cnt != -1) {
                    System.out.print(cnt + " ");
                    break;
                }
            }
            if (cnt == -1) {
                System.out.print(-1 + " ");
            }
            cnt = -1;
        }


    }
}
