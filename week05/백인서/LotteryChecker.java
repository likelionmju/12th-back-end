import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LotteryChecker {
    private List<int[]> lotteryResult = new ArrayList<>();
    private List<Integer> lotteryBonusResult = new ArrayList<>();

    public void checkNumbers(List<int[]> userNumbersList, List<Integer> winNum, int bonusNum) {
        lotteryBonusResult.addAll(winNum);
        lotteryBonusResult.add(bonusNum);

        Collections.sort(lotteryBonusResult);
        Collections.sort(winNum);

        for (int[] array : userNumbersList) {
            Arrays.sort(array);
        }

        int[] matchCountArray = new int[userNumbersList.size()];

        for (int i = 0; i < userNumbersList.size(); i++) {
            int[] array = userNumbersList.get(i);
            for (int number : array) {
                if (winNum.contains(number)) {
                    matchCountArray[i]++;
                }
            }
        }

        for (int i = 0; i < matchCountArray.length; i++) {
            int[] result = new int[]{matchCountArray[i]};
            lotteryResult.add(result);
        }

        int[] bonusMatchCountArray = new int[userNumbersList.size()];

        for (int i = 0; i < userNumbersList.size(); i++) {
            int[] array = userNumbersList.get(i);
            for (int number : array) {
                if (lotteryBonusResult.contains(number)) {
                    bonusMatchCountArray[i]++;
                }
            }
        }
        for (int i = 0; i < bonusMatchCountArray.length; i++) {
            int[] result = new int[]{bonusMatchCountArray[i]};
            lotteryResult.add(3, result);
        }
    }

    public List<int[]> getLotteryResult() {
        return lotteryResult;
    }

    public List<Integer> getLotteryBonusResult() {
        return lotteryBonusResult;
    }
}
