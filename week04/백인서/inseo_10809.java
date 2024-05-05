import java.util.Scanner;

public class inseo_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[26]; // 알파벳 개수만큼 배열 생성

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String S = sc.nextLine();
        for (int i = 0; i < S.length(); i++) { // 입력받은 문자열의 길이 만큼 반복
            char ch = S.charAt(i); // ch에 문자를 하나씩 담음
            int index = ch - 'a'; // index에 알파벳의 index 담김
            if (arr[index] == -1) { // 알파벳이 처음 등장한 경우인지 아닌지 판별하기 위함
                arr[index] = i;
            }
        }

        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}