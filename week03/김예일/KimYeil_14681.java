package week03;

import java.util.Scanner;

public class KimYeil_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int location;

        if(x>0&&y>0) location = 1;
        else if(x<0&&y>0) location = 2;
        else if(x<0&&y<0) location = 3;
        else location = 4;

        System.out.println(location);
        sc.close();
    }
}
