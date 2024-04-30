import java.util.*;

public class Leeseonga_10809 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("영어 단어를 입력하시오.");
        String word = scn.next();

        List<String> alpabet = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

        System.out.println("가장 앞에 있는 알파벳 위치 출력 (미포함시 -1) :");
        System.out.println("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
        for (int i = 0; i < alpabet.size(); i++) {
            String compare = alpabet.get(i);
            System.out.print(word.indexOf(compare) + " ");
        }
    }
}