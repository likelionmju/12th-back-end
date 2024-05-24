package week05lotto;

import java.util.ArrayList;

public class Evaluator {
    private final ArrayList<Integer> winningNumbers;
    private final int bonusNumber, numberOfticket, totalPaid;
    private Counter COUNT;
    private Casher casher;
    private LottoMachine lottoMachine;

    public Evaluator(ArrayList<Integer> winningNumbers, int bonusNumber) {
        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;

        this.casher = new Casher();
        this.numberOfticket = casher.ticket();
        this.totalPaid = this.numberOfticket * Casher.lottoprice;
        this.lottoMachine = new LottoMachine(numberOfticket);
        this.COUNT = new Counter();
        evaluateLottos(lottoMachine.getMyLottos());
        showResults(COUNT, totalPaid);
    }

    private int countMatches(ArrayList<Integer> mylotto) {
        int matchCount = (int) mylotto.stream()
                .filter(winningNumbers::contains)
                .count();

        boolean hasBonus = mylotto.contains(bonusNumber);

        // 매칭된 숫자가 5개이고 보너스 번호가 포함된 경우, 6개로 취급
        return (matchCount == 5 && hasBonus ? matchCount + 1 : matchCount);
    }

    int failed = 0;

    private void evaluateLottos(ArrayList<ArrayList<Integer>> myLottos) {
        for (ArrayList<Integer> mylotto : myLottos) {
            int matchCount = countMatches(mylotto);
            Prize prize;

            switch (matchCount) {
                case 6:
                    prize = Prize.FIRST;
                    break;
                case 5:
                    prize = mylotto.contains(bonusNumber) ? Prize.SECOND : Prize.THIRD;
                    break;
                case 4:
                    prize = Prize.FOURTH;
                    break;
                case 3:
                    prize = Prize.FIFTH;
                    break;
                default:
                    prize = Prize.NONE;
                    failed++;
                    break;
            }

            COUNT.increment(prize);
        }

    }

    public float calculateRevenue(Counter COUNT, int totalPaid) {
        int totalWon = 0;
        for (Prize prize : Prize.values()) {
            if (prize != Prize.NONE) {
                totalWon += COUNT.getCount(prize) * prize.getAmount();
            }
        }

        return (totalPaid - totalWon) / (float) totalPaid;
    }

    public void showResults(Counter COUNT, int totalPaid) {
        float percentage = calculateRevenue(COUNT, totalPaid) * 100;

        System.out.println("\n결과는\n");
        System.out.println("꽝: " + failed + "개");
        for (Prize prize : Prize.values()) {
            if (prize != Prize.NONE) {
                System.out.println(prize.getDescription() + "- " + COUNT.getCount(prize) + "개");
            }
        }

        System.out.println("수익률: " + percentage + "%입니다.");
    }
}