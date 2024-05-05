import java.util.*;

public class inseo_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next().toUpperCase();

        int[] arr = new int[26]; // 알파벳 수 만큼의 배열 생성
        int max = 0; // 최대값을 담을 정수형 변수
        char ch; // 문자열
        int count = 0; // 최대 출현 횟수를 가진 문자의 수를 세는 변수
        char maxW =' '; // 최대출현 횟수를 가진 문자를 저장할 변수

        // 배열요소를 0으로 초기화
        for(int i = 0; i < arr.length; i++){
            arr[i] = 0;
        }

        // 각문자의 출현 횟수 계산
        for (int i = 0; i < S.length(); i++){
            ch = S.charAt(i);
            arr[ch - 'A'] += 1;
        }

        // 최대 출현 횟수 찾기
        for (int i = 0; i < arr.length; i++){
            if (max <= arr[i]){
                max = arr[i];
            }
        }

        // 최대출현 횟수를 가진 문자 매칭 후 그 수 함께 저장
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==max){
                maxW = (char) ('A' + i); // 인덱스를 문자로 변환
                count++;
            }
        }

        if (count < 2){
            System.out.println(maxW); // 최대 출현 횟수를 가진 문자가 하나라면 출력

        }else System.out.println("?"); // 최대 출현 횟수를 가진 문자가 여러 개라면 '?' 출력
    }
}