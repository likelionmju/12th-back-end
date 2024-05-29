import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LotteryRandom {
    private List<int[]> userNumbersList = new ArrayList<>();
    private int howMany;

    public LotteryRandom(int howMany) {
        this.howMany = howMany;
    }

    public void makeRandom() {
        for (int j = 0; j < howMany; j++) {
            int size = 6;
            int[] randomArray = new int[size];
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                int randomNumber;
                boolean isDuplicate;
                do {
                    randomNumber = random.nextInt(45) + 1;
                    isDuplicate = false;

                    for (int k = 0; k < i; k++) {
                        if (randomNumber == randomArray[k]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                } while (isDuplicate);
                randomArray[i] = randomNumber;
            }
            userNumbersList.add(randomArray);
        }
    }

    public List<int[]> getUserNumbersList() {
        return userNumbersList;
    }
}
