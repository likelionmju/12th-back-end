import java.util.Scanner;

public class kimdayeon_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array1[] = new int[n];
        int count = 0;

        for(int i=0;i<array1.length;i++) {
            array1[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for(int i=0;i<array1.length;i++) {
            if(array1[i]==v)
                count++;
        }

        System.out.println(count);
    }
}