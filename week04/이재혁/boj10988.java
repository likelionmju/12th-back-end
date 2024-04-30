package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class boj10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        char[] arr = s.toCharArray();
        Stack st = new Stack<>();
        int flag = 1;

        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                st.push(arr[i]);
            }


            for (int i = arr.length / 2; i < arr.length; i++) {
                if ((char) st.pop() == arr[i]) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
        } else {
            for (int i = 0; i < arr.length / 2; i++) {
                st.push(arr[i]);
            }
            for (int i = arr.length / 2 + 1; i < arr.length; i++) {
                if ((char) st.pop() == arr[i]) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
        }

        System.out.println(flag);
    }
}
