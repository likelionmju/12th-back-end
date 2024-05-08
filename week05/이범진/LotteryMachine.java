import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryMachine {

	private VendingMachine vendingMachine;
	private Winnings winnings;

	private int[][] lotto;
	private int[] rank;
	private int count;
	private int realRank;
	
	public LotteryMachine(VendingMachine vendingMachine, Winnings winnings) {
		this.vendingMachine = vendingMachine;
		this.winnings = winnings;
	}

	private void setCount(int count) {
		this.count = count;
	}

	

	private void compare(int[] wNum) {

		for (int i = 0; i < lotto.length; i++) {
			int nCount = 0;
			rank = new int[lotto.length];
			for (int j = 0; j < lotto[i].length - 1; j++) {
				for (int k = 0; k < wNum.length - 1; k++) {
					if (lotto[i][j] == wNum[k]) {
						nCount++;
						break;
					}
				}
			}

			switch (nCount) {
			case 6:
				rank[i] = 1;
				break;
			case 5:
				if (lotto[i][6] == wNum[6]) {
					rank[i] = 2;
				} else {
					rank[i] = 3;
				}
				break;
			case 4:
				rank[i] = 4;
				break;
			case 3:
				rank[i] = 3;
				break;
			default:
				rank[i]=6;
				break;
			}
		}
	}

	
	
	public void run() {
		setCount(vendingMachine.deposit()); // 카운트 받아오기
		vendingMachine.showTicket(drawNum()); //발행
		compare(winnings.getWNum()); //로또 비교하기
		vendingMachine.showRank(rank);
		
	}

}
