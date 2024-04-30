import java.util.Scanner;
public class Ahnwooseob_10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 원소 개수 받기 *input 1
        int[] arr = new int[num]; // 원소 개수 만큼 배열 크기 만들기

        for (int i = 0; i < arr.length; i++) { // 배열 크기 만큼 for loop에서 원소 받기
            arr[i] = scanner.nextInt(); // *input 2
        }

        int target = scanner.nextInt(); // 원하는 원소 입력 *input 3
        int count =0; // count 0으로 초기화
        for (int i=0; i<arr.length; i++){
            if(arr[i]==target){ // 배열 크기 만큼 for loop 돌면서, 원하는 원소와 같을 경우 +1
                count += 1;
            }
        }
        System.out.println(count);
        scanner.close();

    }
}