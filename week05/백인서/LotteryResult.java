import java.util.List;

public class LotteryResult {
    public void printResult(List<int[]> lastResult, List<Integer> lastBonusResult) {
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count5Bonus = 0;
        int count6 = 0;

        for (int i = 0; i < lastResult.size(); i++) {
            int[] array = lastResult.get(i);
            int numberOfMatches = array[0];

            switch (numberOfMatches) {
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
                case 6:
                    count6++;
                    break;
                case 7:
                    count5Bonus++;
                    break;
            }
        }

        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println("3개 일치 (5,000원) - " + count3 + "개");
        System.out.println("4개 일치 (50,000원) - " + count4 + "개");
        System.out.println("5개 일치 (1,500,000원) - " + count5 + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + count5Bonus + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + count6 + "개");

        int totalPrize = count3 * 5000 + count4 * 50000 + count5 * 1500000 + count5Bonus * 30000000 + count6 * 2000000000;
        int totalInvestment = lastResult.size() * 1000;
        double profitRate = ((double) totalPrize / totalInvestment - 1) * 100;

        System.out.printf("총 수익률은 %.2f%% 입니다.%n", profitRate);
    }
}
