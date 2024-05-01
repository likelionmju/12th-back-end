import java.io.*;

public class KangYerin_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        int sum = 0;
        int mul;
        for (int i = 0; i < 3; i++) {
            mul = n * (m % 10);
            System.out.println(mul);
            sum += mul * Math.pow(10, i);
            m /= 10;
        }
        System.out.println(sum);
        bf.close();
    }
}
