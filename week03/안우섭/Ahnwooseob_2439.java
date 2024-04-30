import java.util.Scanner;

public class Ahnwooseob_2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 줄 개수 받기, 줄 개수랑 별 개수는 같음

        for (int i = 1; i <= num; i++) { // 줄 개수 만큼 for loop
            for (int j = 0; j < num-i; j++) { // 줄 당 n-i 만큼 for loop
                System.out.print(' '); // n-i 만큼 띄어쓰기 출력
            }
            for (int j = 1; j <= i; j++) { // 맨 위의 for loop 안에서 N-(n-i) 만큼 별 생성 
                System.out.print('*');
            }
            System.out.println();
        }
        scanner.close();

    }

}