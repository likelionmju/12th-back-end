package week05lotto;

import java.util.ArrayList;

public class Evaluator {
    private ArrayList<Integer> winningNumbers;
    private int bonusNumber;
    private int numberOfticket;
    private int totalPaid;

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

    public int countMatches(ArrayList<Integer> mylotto) {
        int matchCount = 0;
        int bonusCount = 0;

        for (Integer number : mylotto) {
            if (winningNumbers.contains(number)) {
                matchCount++;
            } else if (number == bonusNumber) {
                bonusCount++;
            }
        }
        if (matchCount == 5 && bonusCount == 1) {
            matchCount++;
        }

        return matchCount;
    }

    int failed = 0;

    public Counter evaluateLottos(ArrayList<ArrayList<Integer>> myLottos) {
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

        return COUNT;
    }

    public float calculateRevenue(Counter COUNT, int totalPaid) {
        int totalWon = COUNT.getCount(Prize.FIRST) * Prize.FIRST.getAmount()
                + COUNT.getCount(Prize.SECOND) * Prize.SECOND.getAmount()
                + COUNT.getCount(Prize.THIRD) * Prize.THIRD.getAmount()
                + COUNT.getCount(Prize.FOURTH) * Prize.FOURTH.getAmount()
                + COUNT.getCount(Prize.FIFTH) * Prize.FIFTH.getAmount();

        return (totalPaid -totalWon) / (float) totalPaid;
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
