import java.io.*;

public class KangYerin_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] s = bf.readLine().split(" ");
        int target = Integer.parseInt(bf.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(s[i]);
            if (k == target) cnt++;
        }
        System.out.print(cnt);
    }
}
