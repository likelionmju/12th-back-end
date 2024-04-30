package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KimYeil_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        int[] countArr = new int[26];
        Arrays.fill(countArr, 0);
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (str.charAt(i) == alphabet[j]) countArr[j]++;
            }
        }
        int max = 0;
        for (int n : countArr) {
            if (max < n) max = n;
        }
        ArrayList<Integer> maxArr = new ArrayList<>();
        for (int i = 0; i < countArr.length; i++) {
            if (max == countArr[i]) maxArr.add(i);
        }
        if (maxArr.size() == 1) System.out.println(alphabet[maxArr.get(0)]);
        else System.out.println("?");
    }
}
