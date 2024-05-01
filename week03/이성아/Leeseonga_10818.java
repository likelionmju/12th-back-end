import java.util.Scanner;

public class Leeseonga_10818 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("정수의 개수를 입력하시오.");
        int num = scn.nextInt();
        int[] arr = new int[num];

        System.out.println("각각의 정수를 공백으로 구분해 입력하시오.");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();

        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}