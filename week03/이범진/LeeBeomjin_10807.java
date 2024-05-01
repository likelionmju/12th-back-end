package week03;

import java.util.Scanner;

public class LeeBeomjin_10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int[] input = new int[n]; // 몇 개의 숫자를 넣을지 선택
        for(int i=0;i<n;i++){
            input[i] = scanner.nextInt(); // 입력받은 값을 넣어준다.

        }
        int wanted = scanner.nextInt(); //찾고싶은 숫자 입력
        int count = 0;
        for(int i=0; i<input.length;i++){
            if(wanted==input[i]){
                count+=1;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
