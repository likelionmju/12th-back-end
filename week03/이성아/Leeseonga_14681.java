import java.util.Scanner;

public class Leeseonga_14681 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("X 좌표를 입력하시오.");
        int X = scn.nextInt();
        System.out.println("Y 좌표를 입력하시오.");
        int Y = scn.nextInt();
        scn.close();

        if(X > 0) {
            if(Y > 0) {
                System.out.print(1);
            }
            else {
                System.out.print(4);
            }
        } else {
            if(Y > 0) {
                System.out.print(2);
            }
            else {
                System.out.print(3);
            }
        }
    }
}