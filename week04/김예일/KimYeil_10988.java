package week04;

import java.util.Scanner;

public class KimYeil_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--)
            newStr += str.charAt(i);

        if (str.equals(newStr)) System.out.println(1);
        else System.out.println(0);
    }
}
