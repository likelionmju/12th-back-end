package week03;

import java.util.Scanner;

public class LeeBeomjin2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt(); // 별 개수 받기
        //별 출력할 러인
        for (int i = 1; i <= input; i++) {
            //해당 라인의 공백 개수
            for (int j = 0; j < input - i; j++) {
                System.out.print(" ");
            }
            //해당 라인의 별 개수
            for (int k = 0; k < i; k++) {
                System.out.print("*");

            }
            System.out.println();// 라인 바꾸기
        }
    scanner.close();
    }

}
