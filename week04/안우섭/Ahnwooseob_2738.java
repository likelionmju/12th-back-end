import java.util.Scanner;

public class Ahnwooseob_2738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] A = new int[n][m];
        int[][] B = new int[n][m];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // 행렬 덧셈 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//        010  55'100' 56'100'
//        222  444     666
//        111  333     444