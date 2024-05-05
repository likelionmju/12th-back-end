package beackjoon;
import java.util.Scanner;
public class kimdayeon_2738 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int a[][] = new int[N][M];
        int b[][] = new int[N][M];
        int sum[][] = new int[N][M];

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}
