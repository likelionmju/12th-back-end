package week05lotto;

import java.util.ArrayList;

public class Evaluator {
    private final int[] PRIZES = {0, 2000000000, 30000000, 1500000, 50000, 5000};
    //가독성을 위해 PRIZES[0](0등)은 0으로 했습니다.
    private ArrayList<Integer> winningNumbers;
    private int bonusNumber;

    public Evaluator(ArrayList<Integer> winningNumbers, int bonusNumber) {
        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }

    public int countMatches(ArrayList<Integer> mylotto) {
        //당첨번호와 내 로또 번호 비교하여 일치하는 경우 count++
        int matchCount = 0;
        int bonusCount = 0;

        for (Integer number : mylotto) {
            if (winningNumbers.contains(number)) {
                matchCount++;
            } else if (number == bonusNumber) {
                bonusCount++;
            }

        }
        //2등(5개 맞고 보너스 번호 맞음)의 경우도 matchCount++
        if (matchCount == 5 && bonusCount == 1) {
            matchCount++;
        }

        return matchCount;
    }
    int failed = 0; //꽝인 로또 개수
    public Counter evaluateLottos(ArrayList<ArrayList<Integer>> myLottos) {
    //Counter 불러와 등수별로 당첨된 로또 수량 기록
        Counter COUNT = new Counter();

        for (ArrayList<Integer> mylotto : myLottos) {
            int matchCount = countMatches(mylotto);
            switch (matchCount) {
                case 6:
                    COUNT.setFirst(COUNT.getFirst() + 1);
                    break;
                case 5:
                    if (mylotto.contains(bonusNumber)) {
                        COUNT.setSecond(COUNT.getSecond() + 1);
                    } else {
                        COUNT.setThird(COUNT.getThird() + 1);
                    }
                    break;
                case 4:
                    COUNT.setFourth(COUNT.getFourth() + 1);
                    break;
                case 3:
                    COUNT.setFifth(COUNT.getFifth() + 1);
                    break;
                default:
                    failed++; break;
                    //당첨이 안 된 경우 failed(꽝)
            }
        }

        return COUNT;
    }

    public float calculateRevenue(Counter COUNT, int totalPaid) {
    //수익률 계산 (당첨된 갯수*당첨금)/(받은 돈 총합)
        float revenue = (totalPaid- (COUNT.getFifth() * PRIZES[5] + COUNT.getFourth() * PRIZES[4] + COUNT.getThird() * PRIZES[3]
                + COUNT.getSecond() * PRIZES[2] + COUNT.getFirst() * PRIZES[1])) / (float) totalPaid;
        return revenue;
    }

    public void showResults(Counter COUNT, int totalPaid) {
        float percentage = calculateRevenue(COUNT, totalPaid) * 100;

        System.out.println("\n결과는");
        System.out.println(" ");

        System.out.println("꽝: " + failed+ "개");
        System.out.println("5등: 3개 일치 (5,000원)- " + COUNT.getFifth() + "개");
        System.out.println("4등: 4개 일치 (50,000원)- " + COUNT.getFourth() + "개");
        System.out.println("3등: 5개 일치 (1,500,000원)- " + COUNT.getThird() + "개");
        System.out.println("2등: 5개+보너스 일치 (30,000,000원)- " + COUNT.getSecond() + "개");
        System.out.println("1등: 6개 일치 (2,000,000,000원)- " + COUNT.getFirst() + "개");

        System.out.println("수익률: " + percentage + "%입니다.");
    }
}
