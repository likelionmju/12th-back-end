public class LotteryMachine {
    private CashInput cashInput;
    private NumberGenerator numberGenerator;
    private Ticket ticket;
    private Compare compare;
    private Ranking ranking;

    public LotteryMachine() {
        this.cashInput = new CashInput();
        this.numberGenerator = new NumberGenerator();
        this.ticket = new Ticket();
        this.compare = new Compare();
        this.ranking = new Ranking();
    }

    public void run(int[] wLotto) {
        cashInput.deposit();
        
       numberGenerator.setCharge(cashInput.getCharge());
       numberGenerator.drawNum();
       
       ticket.setLotto(numberGenerator.getLotto());
       ticket.showTicket();
       
       compare.setLotto(numberGenerator.getLotto(), wLotto);
       compare.compare();
       
       ranking.setInit(cashInput.getCharge(),compare.getRank());
       ranking.showRank();
       
        
    }
}
