
public class Ranking {

	private int charge;
	private int[] rank;
	
	public Ranking() {
		// TODO Auto-generated constructor stub
	}

	public void setCharge(int charge) {

		this.charge = charge;
	}

	public void setRank(int[] rank) {

		this.rank = rank;
	}

	private void showRank() {
		double profit = 0;
		int min = rank[0];

		for (int i = 1; i < rank.length; i++) {
			if (rank[i] < min) {
				min = rank[i];
			}
		}
		charge *= 1000;
		switch (min) {
		case 1:
			profit = 2000000000 - charge*1000;
			break;
		case 2:
			profit = 30000000 - charge*1000;
			break;
		case 3:
			profit = 1500000 - charge*1000;
			break;
		case 4:
			profit = 50000 - charge*1000;
			break;
		case 5:
			profit = 5000 - charge*1000;
			break;
		default:
			// 이외의 등수일 경우 손실
			profit = 0 - charge; // 손실 표시 (음수)
			break;
		}

		double profitRate = Math.round((profit / charge) * 100);

		System.out.println("당신은 " + min + "등에 당첨되셨습니다. 당신의 수익률은 " + profitRate + "입니다.");
	}
}
