import java.util.Scanner;

public class Ahnwooseob_10988 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String str = scanner.next();
            scanner.close();
            int length = str.length();
            int answer = 1;

            for (int i = 0; i < length / 2; i++) { // 짝수 홀수 구분 안 해도 됨 5 - 2, 4 - 2
                if (str.charAt(i) != str.charAt(length - 1 - i)) {
                    answer = 0;
                }
            }
            System.out.println(answer);

        }
    }

