import java.util.Scanner;

public class seongwon_10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(arr[currentChar - 'a'] == -1) {
                arr[currentChar - 'a'] = i;
            }
        }

        // 결과 출력
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
