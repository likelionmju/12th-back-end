package week03;

import java.util.Scanner;

public class Week03_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int newMin = min-45;
        if(newMin<0){
            if(hour>0) hour -= 1;
            else hour = 23;
            newMin += 60;
        }
        System.out.print(hour+" "+newMin);
        sc.close();
    }
}
