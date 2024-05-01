import java.io.*;

public class KangYerin_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int hour = Integer.parseInt(s.split(" ")[0]);
        int min = Integer.parseInt(s.split(" ")[1]);
        if (min >= 45) {
            min -= 45;
        } else if (hour > 0) {
            hour--;
            min += 15;
        } else {
            hour = 23;
            min += 15;
        }
        System.out.print(hour + " " + min);
        bf.close();
    }
}
