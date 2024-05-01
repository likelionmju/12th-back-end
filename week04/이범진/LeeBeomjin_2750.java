package Week04;

import java.util.Arrays;
import java.util.Scanner;

public class LeeBeomjin_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[sc.nextInt()];
        for(int i =0; i<input.length; i++){
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);
        for(int num : input){
            System.out.println(num);
        }

    }
}
