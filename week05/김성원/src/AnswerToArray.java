import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class AnswerToArray {
    public static int[] answer = new int[7];
    private NumberMake numberMake;

    public AnswerToArray(NumberMake numberMake) {
        this.numberMake = numberMake;
    }

    public void answearray() {
        try {
            File file = new File("lotto.txt");
            Scanner scanner = new Scanner(file);
            for (int i = 0; i < 7; i++) {
                answer[i] = scanner.nextInt();
            }
            scanner.close();
            System.out.println(Arrays.toString(answer));
            Result result = new Result(numberMake, this);
            result.lottoresult();
        } catch (FileNotFoundException e) {
            System.out.println("로또 번호 파일을 찾을 수 없습니다.");
        }
    }
}
