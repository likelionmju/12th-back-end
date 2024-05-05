package week04;

import java.util.Scanner;

public class KimYeil_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().strip();
        int count = 0;
        if (!str.isBlank()) {
            String[] arr = str.split(" ");
            count = arr.length;
        }
        System.out.println(count);
    }
}
