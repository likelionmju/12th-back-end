import java.io.*;

public class KangYerin_10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int max = -1000000;
        int min = 1000000;
        String s = bf.readLine();
        String[] arr = s.split(" ");
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(arr[i]);
            if (k < min) {
                min = k;
            }
            if (k > max) {
                max = k;
            }
        }
        System.out.print(min + " " + max);
        bf.close();
    }
}
