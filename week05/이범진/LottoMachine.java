public class LottoMachine {
	private LottoShop lottoShop;
	private LottoNumGenerator numberGenerator;
	private LottoTicket ticket;
	private LottoCompare compare;
	private LottoRanking lottoRanking;
	private Winnings winnings;

	public LottoMachine() {
		this.lottoShop = new LottoShop();
		this.numberGenerator = new LottoNumGenerator();
		this.ticket = new LottoTicket();
		this.compare = new LottoCompare();
		this.lottoRanking = new LottoRanking();
		this.winnings = new Winnings();
	}

	public void run() {
		// 금액 받기
		lottoShop.deposit();
		// 로또 번호 만들기
		numberGenerator.setCharge(lottoShop.getCharge());
		numberGenerator.generateNum();
		// 구매자에게 로또번호 출력
		ticket.setLotto(numberGenerator.getLotto());
		ticket.showTicket();
		//1등 번호 받아오기
		winnings.readWinnin();
		// 1등 번호 비교 
		compare.setLotto(numberGenerator.getLotto(), winnings.getWLotto());
		compare.compare();
		// 등수, 손익 계산
		lottoRanking.setInit(lottoShop.getCharge(), compare.getRank());
		lottoRanking.showRank();

	}
}
