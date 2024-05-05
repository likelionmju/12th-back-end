import java.util.Collection;
import java.util.Scanner;
import java.util.Arrays;

public class inseo_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수값 입력
        int[] arr = new int[n]; // 배열 크기설정

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 오름차순 정렬
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]); // 정수
        }
    }
}
