import java.util.Scanner;

public class Leeseonga_2588 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("곱하실 첫 번째 세자리수를 입력하시오.");
        int num1 = scn.nextInt();
        System.out.println("곱하실 두 번째 세자리수를 입력하시오.");
        int num2 = scn.nextInt();
        scn.close();

        System.out.println("  " + num1 * (num2 % 10));
        System.out.println(" " + num1 * ((num2 % 100) / 10));
        System.out.println(num1 * (num2 / 100));
        System.out.println("-----");
        System.out.println(num1 * num2);
    }
}