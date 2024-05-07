package week04;

import java.util.Scanner;

public class LeeBeomjin_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] compare = input.toCharArray();
        int result = 1;

        for(int i=0;i<compare.length /2;i++){ // 얘 반절 자르기
                if(compare[i] !=compare[compare.length-1-i]){
                    result = 0;
                    break;
                }
            }
        System.out.println(result);
        }
    }

