
public class Main {

	public static void main(String[] args) {
		Winnings winnings = new Winnings();
		LotteryMachine lotteryMachine = new LotteryMachine();

		winnings.readWinnin();
		lotteryMachine.run(winnings.getWLotto());

	}

}