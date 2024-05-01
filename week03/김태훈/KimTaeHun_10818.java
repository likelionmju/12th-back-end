import java.util.Scanner;
public class KimTaeHun_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1000001;
        int max = -1000001;
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>=max){
                max = arr[i];
            }
            if(arr[i]<=min){
                min = arr[i];
            }
        }
        System.out.print(min + " " + max);
    }
}