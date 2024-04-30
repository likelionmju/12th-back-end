import java.util.Scanner;
import java.util.Arrays;

public class Ahnwooseob_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 개수 받음
        int [] arr = new int[N]; // 5개 짜리 배열 만듦

        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[N-1]);
        scanner.close();


    }
}
