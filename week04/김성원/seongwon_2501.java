package baekjooon;

import java.util.ArrayList;
import java.util.Scanner;

public class seongwon_2501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int cnt = scanner.nextInt();

        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        if (cnt > divisors.size()) {
            System.out.println(0);
        }else {
            System.out.println(divisors.get(cnt - 1));
        }

    }
}
