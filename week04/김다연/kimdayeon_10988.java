package beackjoon;
import java.util.Scanner;
public class kimdayeon_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int len = s.length();
        int isP = 0;

        for(int i=0;i<len/2;i++) {
            if(s.charAt(i)==s.charAt(len-1-i)) {
                isP = 1;
            }
        }
        System.out.println(isP);
    }
}
