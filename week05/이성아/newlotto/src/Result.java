import java.io.FileNotFoundException;

public class Result {
    private InputMoney inputMoney;
    private MakeLotto makeLotto;
    private CompareTickets compareTickets;
    private int money;
    private int tickets;
    private int winningReward;

    public Result() throws FileNotFoundException {
        this.makeLotto = new MakeLotto();
        this.inputMoney = new InputMoney();
        this.compareTickets = new CompareTickets();
        this.money = 0;
        this.tickets = 0;
        this.winningReward = 0;
    }

    public void start() {
        this.money = inputMoney.getMoney();
        System.out.println("입력한 금액 : " + this.money);

        this.tickets = this.money / 1000;
        LottoTickets lottoTickets = makeLotto.addTicketNums(this.tickets);

        System.out.println("구매한 로또 번호 :");
        lottoTickets.print();

        this.winningReward = compareTickets.getWinning(lottoTickets);
        System.out.println("상금 : " + this.winningReward);

        float rateOfIncome = IncomeRate.calculateIncomeRate(this.money, this.winningReward);
        System.out.println("수익률 : " + rateOfIncome + "%");
    }
}
