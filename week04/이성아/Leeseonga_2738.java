import java.util.Scanner;

public class Leeseonga_2738 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int column = scn.nextInt();

        int[][] arrayA = new int[row][column];
        int[][] arrayB = new int[row][column];
        int[][] arraySum = new int[row][column];
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrayA[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrayB[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int a = arrayA[i][j];
                int b = arrayB[i][j];
                sum = a + b;
                arraySum[i][j] = sum;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arraySum[i][j] + " ");
            }
        System.out.println();
        }
    }
}