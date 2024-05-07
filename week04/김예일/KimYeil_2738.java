package week04;

import java.util.Scanner;

public class KimYeil_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr = new int[a][b];
        int[][] arr2 = new int[a][b];
        int[][] resultArr = new int[a][b];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < resultArr[i].length; j++) {
                resultArr[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        for (int[] nArr : resultArr) {
            for (int n : nArr)
                System.out.print(n + " ");
            System.out.println();
        }
    }
}
