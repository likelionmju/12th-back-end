package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class boj1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        s = s.toLowerCase();

        char[] arr = s.toCharArray();
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt += 1;
                }
            }
            arr2[i] = cnt;
        }


        int[] sortedArr2 = Arrays.copyOf(arr2, arr2.length);
        int max = -1;

        if (sortedArr2[0] == sortedArr2[1]) {
            System.out.println("?");
        } else {
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] > max) {
                    max = i;
                }
            }

            System.out.println(Character.toUpperCase(arr[max]));
        }
    }
}
