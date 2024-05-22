public class Result {
    public int[] lottograde;
    private final NumberMake numberMake;
    private final AnswerToArray answerToArray;

    public Result(NumberMake numberMake, AnswerToArray answerToArray) {
        this.numberMake = numberMake;
        this.answerToArray = answerToArray;
        lottograde = new int[numberMake.count.count];
    }

    public void lottoresult() {
        for (int i = 0; i < numberMake.count.count; i++) { // 로또 구매한 개수만큼 반복
            int cnt = 0;    //정답 비교하는 변수
            int bonus = 0;  //보너스 확인하는 변수
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (NumberMake.lotto[i][j] == AnswerToArray.answer[k]) {
                        cnt++;
                    }
                }
                if (NumberMake.lotto[i][j] == AnswerToArray.answer[6]) {
                    bonus++;
                }
            }
            if (cnt == 6) lottograde[i] = 1;
            else if (cnt == 5 && bonus == 1) lottograde[i] = 2;
            else if (cnt == 5) lottograde[i] = 3;
            else if (cnt == 4) lottograde[i] = 4;
            else if (cnt == 3) lottograde[i] = 5;
            else lottograde[i] = 6;
        }
        Profit profit = new Profit(numberMake.count.count, numberMake.count, this);
        profit.generateprofit();
    }
}
