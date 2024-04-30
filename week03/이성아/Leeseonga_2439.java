import java.util.Scanner;

public class Leeseonga_2439 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("출력할 별의 마지막 줄을 숫자로 입력하시오.");
        int num = scn.nextInt();
        scn.close();

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}