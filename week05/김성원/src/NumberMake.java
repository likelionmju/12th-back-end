import java.util.Random;

public class NumberMake {

    public static int[][] lotto = new int[Main.count][6];
    static Random rand = new Random();

    public static void generateLottoNumbers() {
        for (int i = 0; i < Main.count; i++) {
            for (int j = 0; j < 6; j++) {
                lotto[i][j] = rand.nextInt(45) + 1;
            }
        }
    }
}
