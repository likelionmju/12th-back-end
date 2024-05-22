public class Profit {
    private int profitRate;
    private Count count;
    private Result result;

    public Profit(int i, Count count, Result result) {
        this.count = count;
        this.result = result;
    }

    public void generateprofit() {
        int initialInvestment = count.count * 1000; // 초기 투자금액
        int pureprofit = 0; // 순이익을 0으로 초기화

        int grade1 = 2000000000;
        int grade2 = 30000000;
        int grade3 = 1500000;
        int grade4 = 50000;
        int grade5 = 5000;

        for (int i = 0; i < count.count; i++) {
            switch (result.lottograde[i]) {
                case 1:
                    pureprofit += grade1;
                    break;
                case 2:
                    pureprofit += grade2;
                    break;
                case 3:
                    pureprofit += grade3;
                    break;
                case 4:
                    pureprofit += grade4;
                    break;
                case 5:
                    pureprofit += grade5;
                    break;
            }
        }

        // 순이익 계산 (당첨금 - 투자금액)
        pureprofit -= initialInvestment;

        // 수익률 계산
        double profitRate = ((double) pureprofit / initialInvestment) * 100;

        // 수익률 출력
        System.out.printf("수익률: %.2f%%\n", profitRate);

        Print print = new Print(count, result, this);
        print.generatePrint();
    }
}
