//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class KimTaeHun_2588 {
    public KimTaeHun_2588() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int h = 100;
        int x = 0;
        int y = 0;
        int z = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < 3; ++i) {
            int m = b / h;
            if (h == 100) {
                z += a * m;
                sum += z * h;
                b -= m * h;
            } else if (h == 10) {
                y += a * m;
                sum += y * h;
                b -= m * h;
            } else if (h == 1) {
                x += a * m;
                sum += x * h;
                b -= m * h;
            }

            h /= 10;
        }

        System.out.print("" + x + "\n" + y + "\n" + z + "\n" + sum);
    }
}
