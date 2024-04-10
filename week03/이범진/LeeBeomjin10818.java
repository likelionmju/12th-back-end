package week03;

import java.util.Scanner;

public class LeeBeomjin10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] num = new int[n];

        for(int i=0;i<n;i++){
            int input = scanner.nextInt();
            num[i] = input;
        }

        int minnum = num[0];
        int maxnum = num[0];
        for (int i =1; i<n;i++){
            if(minnum>num[i]){
                minnum = num[i];
            }
            if(num[i]>maxnum){
                maxnum=num[i];
            }
        }
        System.out.println(minnum+" "+maxnum);
    }
}
