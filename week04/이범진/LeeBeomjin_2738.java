package week04;

import java.util.Scanner;

public class LeeBeomjin_2738 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] one = new int[R][C];
        for(int i=0; i<R;i++){
            for(int j=0;j<C;j++){
                one[i][j] = sc.nextInt();
            }
        }
        int[][] two = new int[R][C];
        for(int i=0; i<R;i++){
            for(int j=0;j<C;j++){
                two[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<R;i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(one[i][j] + two[i][j] + " ");
            }
            System.out.println();
        }
        }
    }

