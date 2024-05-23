import java.util.Arrays;
import java.util.List;

public class LottoResultsProcessor {
    private static final int PRICE_PER_TICKET = 1000;

    public void checkResults(List<LottoTicket> tickets, List<Integer> winningNumbers, int bonusNumber) {
        int totalWinnings = 0;
        int totalTickets = tickets.size();
        int totalSpent = totalTickets * PRICE_PER_TICKET;

        for (LottoTicket ticket : tickets) {
            int matches = countMatches(ticket, winningNumbers);
            boolean isBonusMatched = isBonusMatched(ticket, bonusNumber);
            int prize = calculatePrize(matches, isBonusMatched);
            totalWinnings += prize;

            System.out.println("티켓 번호: " + Arrays.toString(ticket.getNumbers()) + (prize > 0 ? " 당첨! 상금 " + prize + "원" : " 미당첨"));
        }

        double profit = totalWinnings - totalSpent;
        double profitPercentage = (profit / (double) totalSpent) * 100;

        System.out.println("총 상금: " + totalWinnings + "원");
        System.out.println("총 지출: " + totalSpent + "원");
        System.out.printf("수익률: %.2f%%\n", profitPercentage);
    }

    private int countMatches(LottoTicket ticket, List<Integer> winningNumbers) {
        int matches = 0;
        for (int num : ticket.getNumbers()) {
            if (winningNumbers.contains(num)) {
                matches++;
            }
        }
        return matches;
    }

    private boolean isBonusMatched(LottoTicket ticket, int bonusNumber) {
        return Arrays.stream(ticket.getNumbers()).anyMatch(num -> num == bonusNumber);
    }

    private int calculatePrize(int matches, boolean isBonusMatched) {
        if (matches < 3) {
            return 0;
        } else if (matches == 3) {
            return PRIZES.FIFTH.getValue();
        } else if (matches == 4) {
            return PRIZES.FOURTH.getValue();
        } else if (matches == 5) {
            return isBonusMatched ? PRIZES.SECOND.getValue() : PRIZES.Third.getValue();
        } else if (matches == 6) {
            return PRIZES.FIRST.getValue();
        } else {
            return 0;
        }
    }

}
