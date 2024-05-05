package week04;

import java.util.Arrays;
import java.util.Scanner;

public class KimYeil_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();

        char[] alphabetArr = new char[26];
        for (int i = 0; i < alphabetArr.length; i++) {
            alphabetArr[i] = (char) ('a' + i);
        }

        int[] indexArr = new int[26];
        Arrays.fill(indexArr, -1);

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alphabetArr.length; j++) {
                if (indexArr[j] != -1) continue;
                if (str.charAt(i) == alphabetArr[j]) {
                    indexArr[j] = i;
                }
            }
        }
        for (int i = 0; i < indexArr.length; i++) {
            if (i + 1 != indexArr.length)
                System.out.print(indexArr[i] + " ");
            else
                System.out.print(indexArr[i]);
        }

    }
}
