import java.util.Scanner;

public class Leeseonga_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("알람을 설정할 시각인 H와 M을 입력하시오.");
        int H = sc.nextInt();
        int M = sc.nextInt();
        scn.close();

        if (M < 45) {
            H--;
            M = 60 - (45 - M);

            if (H < 0) {
                H = 23;
            }

            System.out.println(H + " " + M);

        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}