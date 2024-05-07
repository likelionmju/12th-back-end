import java.util.*;

public class Leeseonga_1152 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine();
        scn.close();
        sentence = sentence.trim();

        System.out.println(sentence.split(" ").length);
    }
}