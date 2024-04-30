import java.io.*;

public class KangYerin_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());
        int y = Integer.parseInt(bf.readLine());
        if (x > 0 && y > 0) {
            System.out.print(1);
        } else if (x < 0 && y > 0) {
            System.out.print(2);
        } else if (x < 0 && y < 0) {
            System.out.print(3);
        } else {
            System.out.print(4);
        }
        bf.close();
    }
}