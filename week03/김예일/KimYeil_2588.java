package week03;

import java.util.Scanner;

public class Week03_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int first = a * (b%10);
        int second = a * ((b/10)%10);
        int third = a * (b/100);
        int sum = first+second*10+third*100;
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(sum);
    }
}
