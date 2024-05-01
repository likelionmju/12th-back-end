import java.util.Scanner;
import java.util.Arrays;
public class Leejiwoo_10809 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] word = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            word[i] = input.charAt(i);
        }
        int[] firstalpha = new int[26]; // 알파벳 처음 등장 위치 저장
        for (int i = 0; i < firstalpha.length; i++) {
            firstalpha[i] = -1;
        }

        int cnt = 0;
        for (int i = 0; i < word.length; i++) {
            char ch = word[i];
            int idx = ch - 'a';

            if (firstalpha[idx] == -1) {
            	firstalpha[idx] = cnt;
            }
            cnt++;
        }

        for (int i = 0; i < 26; i++) { // 처음 등장한 경우 저장
            System.out.print(firstalpha[i] + " ");
        }
        scanner.close();
	}
	//pass
}
