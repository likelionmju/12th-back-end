import java.util.Arrays;

public class Print {
    private Count count;
    private Result result;
    private Profit profit;

    public Print(Count count, Result result, Profit profit) {
        this.count = count;
        this.result = result;
        this.profit = profit;
    }

    public void generatePrint() {
        System.out.print("이번주 로또 번호 : ");
        System.out.println(Arrays.toString(AnswerToArray.answer)); //로또 정답

        for (int i = 0; i < count.count; i++) {
            System.out.print(i + 1);
            System.out.print("번 로또 : ");
            System.out.print(Arrays.toString(NumberMake.lotto[i]));//구매한 로또
            if (result.lottograde[i] == 6) {
                System.out.println("꽝");
            } else {
                System.out.print(result.lottograde[i]);//로또 등수
            }

        }
    }
}