import java.util.Scanner;
import java.util.Arrays;
public class Leejiwoo_1157 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        char[] word = new char[1000000];
        int[] alphabet = new int[26];
        String input = scanner.next();
        word = input.toCharArray(); // 문자열을 문자 배열로 바꿔주기

        for (int i = 0; i < word.length; i++) {
            char ch = word[i];
            if (Character.isLowerCase(ch)) {
            	alphabet[ch - 'a']++;
            } else if (Character.isUpperCase(ch)) {
            	alphabet[ch - 'A']++;
            }
        }

        int maxIdx = 0; // 최대 출현 횟수를 갖는 알파벳 인덱스
        int maxCnt = alphabet[0]; // 최대 출현 횟수
        int result = 0; // 최대 출현 횟수를 갖는 알파벳 수

        // 가장 많이 출현한 알파벳을 찾는 반복문
        for (int i = 0; i < 26; i++) {
            if (maxCnt < alphabet[i]) {
                maxCnt = alphabet[i];
                maxIdx = i;
            }
        }

        // 최대 출현 횟수를 갖는 알파벳의 개수를 세는 반복문
        for (int i = 0; i < 26; i++) {
            if (maxCnt == alphabet[i]) {
                result++;
            }
        }

        if (result == 1) {
            System.out.println((char) (maxIdx + 'A'));
        } else if (result > 1) {
            System.out.println("?");
        }

        scanner.close();
	}

}
