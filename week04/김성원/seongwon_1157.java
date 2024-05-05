package baekjooon;

import java.util.Scanner;

public class seongwon_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine(); // 사용자로부터 한 줄을 입력받음

        int[] letterCount = new int[26]; // 알파벳 26자에 대한 빈도수 배열

        // 입력받은 단어를 순회하며 각 알파벳의 빈도수를 계산
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                letterCount[ch - 'A']++; // 대문자일 경우
            } else if (ch >= 'a' && ch <= 'z') {
                letterCount[ch - 'a']++; // 소문자일 경우
            }
        }

        // 가장 많이 출현한 알파벳 찾기
        int maxIndex = 0;
        for (int i = 0; i < 26; i++) {
            if (letterCount[i] > letterCount[maxIndex]) {
                maxIndex = i;
            }
        }

        // 가장 많이 출현한 알파벳 출력 (대문자로)
        char mostFrequentLetter = (char) (maxIndex + 'A');
        System.out.println(mostFrequentLetter);

        scanner.close(); // Scanner 객체를 닫음
    }
}
