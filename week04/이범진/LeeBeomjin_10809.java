package Week04;

import java.util.Scanner;

public class LeeBeomjin_10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int[] positions = new int[26];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1;
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (positions[index] == -1) {
                positions[index] = i;
            }
        }
        for (int position : positions) {
            System.out.print(position + " ");
        }
    }
}
