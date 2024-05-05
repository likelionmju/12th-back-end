import java.util.Scanner;
import java.util.HashMap;

public class Ahnwooseob_10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        HashMap<Character, Integer> alpMap = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alpMap.put(c, -1);
        }

        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (alpMap.get(ch) == -1) {
                alpMap.put(ch, i);
            }
        }

        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(alpMap.get(c)).append(" ");
        }
        System.out.println(sb);
        scanner.close();
    }
}
