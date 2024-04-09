package week03;

import java.util.Scanner;

public class BaekJoon14681 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input1 = scan.nextInt();
        int input2 = scan.nextInt();

        int state = getState(input1, input2);


        switch (state) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
        }
        scan.close();
    }

    public static int getState(int input1, int input2) {
        if (input1 > 0 && input2 > 0) {
            return 1;
        } else if (input1 < 0 && input2 > 0) {
            return 2;
        } else if (input1 < 0 && input2 < 0) {
            return 3;
        } else {
            return 4;
        }

    }

}

