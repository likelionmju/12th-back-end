package beackjoon;

import java.util.Scanner;

public class kimdayeon_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) -'A' ;
            arr[num]++;
        }


        int max = 0;
        char a = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                a = (char) (i + 'A');
            } else if (arr[i] == max) {
                a = '?';
            }
        }
        System.out.print(a);
    }

}
