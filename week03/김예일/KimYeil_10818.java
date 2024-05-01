package week03;

import java.util.Scanner;

public class KimYeil_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] numArr = new int[count];
        for(int i=0; i<count; i++){
            numArr[i] = sc.nextInt();
        }
        int min = numArr[0];
        int max = numArr[0];
        for(int n:numArr){
            if(min>n) min = n;
            if(max<n) max = n;
        }
        System.out.print(min+" "+max);
        sc.close();
    }
}
