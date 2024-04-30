import java.util.Arrays;
import java.util.Scanner;

public class inseo_10818 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[n - 1]);
    }
}
