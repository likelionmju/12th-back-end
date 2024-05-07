import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class AnswerToArray {

    public static int[] answer = new int[7];

    public static void answearray() throws FileNotFoundException {
        File file = new File("lotto.txt");
        Scanner scanner = new Scanner(file);
        for (int i = 0; i < 7; i++) {
            answer[i] = scanner.nextInt();
        }
        scanner.close();
        //System.out.println(Arrays.toString(answer));
    }
}
