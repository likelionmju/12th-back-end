package week03;

import java.util.Scanner;

public class LeeBeomjin_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[2];

        for(int i=0;i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        if(arr[1]>=45){
            arr[1] -=45;
        }else{
            if(arr[0]==0){
                arr[0] = 23;
                arr[1] +=15;
            }else{
                arr[0]-=1;
                arr[1] += 15;
            }
        }
        System.out.println(arr[0]+ " "+ arr[1]);
    }
}
