import java.security.SecureRandom;

public class MakeLotto {
    private final SecureRandom secureRandom;
    private final LottoTickets LottoTickets;
    final int maxNum = 46;
    final int minNum = 1;

    public MakeLotto(){
        this.secureRandom = new SecureRandom();
        this.LottoTickets = new LottoTickets();
    }
    public LottoTickets addTicketNums(int numOfLotto) {
        for (int i = 0; i < numOfLotto; i++) {
            LottoTickets.add(createTicketNum());
        }
        return this.LottoTickets;
    }
    private LottoTicket createTicketNum(){
        LottoTicket lotto = new LottoTicket();
        for (int i = 0; i < 6; i++) {
            int randomNum = secureRandom.nextInt(maxNum - minNum) + minNum;
            lotto.add(randomNum);
        }
        return lotto;
    }
}