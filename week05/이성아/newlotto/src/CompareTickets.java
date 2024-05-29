import java.io.*;
import java.util.*;

public class CompareTickets {
    private int winning;
    private LottoTicket winningNum;
    private int bonusNum;

    public CompareTickets() throws FileNotFoundException {
        BufferedReader bf;
        try {
            bf = new BufferedReader(new FileReader(new File("./src/winning.txt")));

            String s= bf.readLine();
            String[] arr= s.split(" ");
            winningNum = new LottoTicket();

//            //this.winningNum = new LottoTicket();
            for (int i = 0; i < 6; i++) {
                int num = Integer.parseInt(arr[i]);
                this.winningNum.add(num);
            }
            bonusNum = Integer.parseInt(arr[6]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        enum LottoReward {
        first(6,2000000000),
        second(5.5,30000000),
        third(5,1500000),
        fourth(4,50000),
        fifth(3,5000),
        nothing(0,0);
        private double num;
        private int reward;

        LottoReward(double num, int reward){
            this.num = num;
            this.reward = reward;
        }

        public static LottoReward getWinningStandard(double num){
            return Arrays.stream(LottoReward.values())
                    .filter(x-> x.num==num)
                    .findAny()
                    .orElse(nothing);
        }
        public static int getLottoReward(double num){
            return getWinningStandard(num).getReward();
        }
        public int getReward(){
            return this.reward;
        }
    }

    public int getWinning(LottoTickets lottoTickets) {
        for (int i = 0; i < lottoTickets.getLenght(); i++) {
            winning += calculate(lottoTickets.getLotto(i));
        }
        return this.winning;
    }

    private int calculate(LottoTicket lotto) {
        int rewardNum = 0;
        for (int i = 0; i < 6; i++) {
            if (this.winningNum.contains(lotto.getList().get(i))) {
                rewardNum++;
            }
        }
        if (rewardNum < 3) {
            rewardNum = 0;
        }
        if (rewardNum != 5) {
            return LottoReward.getLottoReward(rewardNum);
        }
        if (lotto.contains(bonusNum)) {
            return LottoReward.getLottoReward(5.5);
        }
        return LottoReward.getLottoReward(5);
    }
}
