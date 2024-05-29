import java.util.Random;

public class NumberMake {
    public static int[][] lotto;
    Count count;
    private Random rand = new Random();

    public NumberMake(Count count) {
        this.count = count;
        lotto = new int[count.count][6];
    }

    public void generateLottoNumbers() {
        for (int i = 0; i < count.count; i++) {
            for (int j = 0; j < 6; j++) {
                lotto[i][j] = rand.nextInt(45) + 1;
            }
        }
        AnswerToArray answerToArray = new AnswerToArray(this);
        answerToArray.answearray();
    }
}
