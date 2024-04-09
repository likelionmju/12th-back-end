import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int s = scanner.nextInt();

        if (f > 0 && s > 0) {
            System.out.println(1);
        } else if (f < 0 && s > 0) {
            System.out.println(2);

        } else if (f < 0 && s < 0) {
            System.out.println(3);

        } else {
            System.out.println(4);
        }
        scanner.close();

    }
}