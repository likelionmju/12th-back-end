import java.util.Scanner;

public class Ahnwooseob_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] count = new int[26]; // 알파벳 수 만큼의 count 배열 생성
                                   // 출현횟수를 저장하는데 사용

        // 문자열 입력 및 처리
        String str = scanner.next().toUpperCase(); // 대문자로 받기
        for (int i = 0; i < str.length(); i++) { // 입력받은 문자길이 만큼 loop
            char ch = str.charAt(i); // str의 한 문자씩
            count[ch - 'A']++;
//                'A'의 ASCII 값은 65이고, 'B'는 66, 'C'는 67, ..., 'Z'는 90
//                'Z'가 들어오면 90-65 = 25번 인덱스 값 +1
        }

        // 가장 많이 등장한 알파벳 찾기
        int maxCount = 0;
        char answer = '?';
        boolean isDuplicated = false;
        for (int i = 0; i < count.length; i++) { // count 길이 만큼 loop
            if (maxCount < count[i]) {  // 비교하고, count값이 더 크다면
                maxCount = count[i]; // 해당 알파벳 인덱스에 해당하는 값으로 변함
                answer = (char) ('A' + i); // 65+해당 인덱스 값 = 알파벳으로 answer 출력
                isDuplicated = false;
            } else if (maxCount == count[i]) {
                isDuplicated = true; // 만약에 count값이랑 같은 개수가 나오면 중복
            }
        }

        // 동일한 빈도수를 가진 알파벳이 있는 경우
        if (isDuplicated) { // ture면 answer = ?
            answer = '?';
        }

        System.out.println(answer); // 알파벳 출력
        scanner.close();
    }
}
