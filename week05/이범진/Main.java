
public class Main {

	public static void main(String[] args) {
		Winnings winnings = new Winnings();
		VendingMachine vendigMachine = new VendingMachine();

		LotteryMachine lotteryMachine = new LotteryMachine(vendigMachine, winnings);

		winnings.readWinnin();
		lotteryMachine.run();

	}

}