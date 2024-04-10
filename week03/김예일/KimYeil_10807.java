package week03;

import java.util.Scanner;

public class Week03_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];
        for (int i=0; i<num; i++){
            numArr[i] = sc.nextInt();
        }
        int findNum = sc.nextInt();
        int count = 0;
        for(int n:numArr)
            if(n == findNum) count++;
        System.out.println(count);
        sc.close();
    }
}
