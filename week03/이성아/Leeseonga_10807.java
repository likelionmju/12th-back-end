import java.util.Scanner;

public class Leeseonga_10807 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("입력하려는 정수의 개수를 입력하시오.");
        int num = scn.nextInt();

        System.out.println("공백으로 구분하여 정수를 입력하시오.");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("개수를 찾으려는 특정한 정수를 입력하시오.");
        int n = scn.nextInt();
        scn.close();

        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (n == arr[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}