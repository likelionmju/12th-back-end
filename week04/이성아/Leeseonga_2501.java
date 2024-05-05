import java.util.Scanner;

public class Leeseonga_2501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N의 약수들 중 K번째로 작은 수를 출력합니다.");
        System.out.println("자연수 N과 K를 각각 입력하시오.");
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    System.out.println(i);
                    scanner.close();
                    return;
                }
            }
        }
        System.out.println("해당하는 약수가 존재하지 않습니다.");
        scanner.close();
    }
}