package baekjooon;
import java.util.Scanner;
public class seongwon_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        System.out.println(words.length);
        scanner.close();
    }
}

