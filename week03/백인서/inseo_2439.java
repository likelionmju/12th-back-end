import java.util.Scanner;

public class inseo_2439 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < a - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0 ; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}