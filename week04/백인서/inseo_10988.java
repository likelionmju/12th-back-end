import java.util.*;

public class inseo_10988 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // 문자열 입력받음
        int ans = 1;

        for (int i = 0 ; i < str.length()/2; i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                ans = 0;
                break;
            }
        }
        System.out.println(ans);
    }
}