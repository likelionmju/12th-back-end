import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws LotteryFileread.InvalidFileFormatException, FileNotFoundException {
        LotteryInput lotteryInput = new LotteryInput();
        lotteryInput.inputPrice();

        int ticketCount = lotteryInput.getHowMany();

        LotteryRandom lotteryRandom = new LotteryRandom(ticketCount);
        lotteryRandom.makeRandom();

        List<int[]> userNumbersList = lotteryRandom.getUserNumbersList();

        for (int[] array : userNumbersList) {
            System.out.println(Arrays.toString(array));
        }

        System.out.println();

        LotteryFileread lotteryFileread = new LotteryFileread();
        lotteryFileread.readFile("C:\\Users\\82109\\OneDrive\\바탕 화면\\LotteryNumber.txt");

        List<Integer> winningNumbers = lotteryFileread.getWinningNumbers();
        int bonusNumber = lotteryFileread.getBonusNumber();

        System.out.println("당첨번호: " + winningNumbers);
        System.out.println("보너스 번호: " + bonusNumber);

        LotteryChecker lotteryChecker = new LotteryChecker();
        lotteryChecker.checkNumbers(userNumbersList, winningNumbers, bonusNumber);

        LotteryResult lotteryResult = new LotteryResult();
        lotteryResult.printResult(lotteryChecker.getLotteryResult(), lotteryChecker.getLotteryBonusResult());
    }
}
