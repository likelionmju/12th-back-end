import java.util.Scanner;

public class Ahnwooseob_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int s = scanner.nextInt();

        System.out.println(f*(s%10)); //두번째 곱하기 숫자에서 1의 자리만 뽑고 첫번째랑 곱하기
        System.out.println(f*(s%100/10)); //두번째 곱하기 숫자에서 10의 자리만 뽑고 첫번째랑 곱하기
        System.out.println(f*(s/100)); //두번째 곱하기 숫자에서 100의 자리만 뽑고 첫번째랑 곱하기
        System.out.println(f*s);
        scanner.close();

    }
}