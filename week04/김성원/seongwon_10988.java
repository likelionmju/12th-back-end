package baekjooon;

import java.util.Scanner;

public class seongwon_10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.next();
        int matchCount = 0;
        for(int i = 0; i < inputString.length() / 2; i++) {
            if(inputString.charAt(i) == inputString.charAt(inputString.length() - (i + 1))) {
                matchCount++;
            }
        }

        if (matchCount == inputString.length() / 2) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
