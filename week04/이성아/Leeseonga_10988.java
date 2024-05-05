import java.util.*;

public class Leeseonga_10988 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.next();
        scn.close();
        int answer = 1;

        for(int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                answer = 0;
            }
        }
        System.out.println(answer);
    }
}