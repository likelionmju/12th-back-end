import java.util.*;

public class Leeseonga_1157 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine().toUpperCase();

        int[] alpabet = new int[26];

        for (int i = 0; i < word.length(); i++) {
            int num = word.charAt(i) - 65;
            alpabet[num]++;
        }

        int max = -1;
        char answer = '?';

        for (int i = 0; i < alpabet.length; i++) {
            if (alpabet[i] > max) {
                max = alpabet[i];
                answer = (char) (i + 65);
            } else if (alpabet[i] == max) {
                answer = '?';
            }
        }
        System.out.print(answer);
    }
}