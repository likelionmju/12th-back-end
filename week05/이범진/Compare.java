
public class Compare {
	private int[][] lotto;
	private int[] rank;
	private int[] wLotto;
	
	public Compare() {
		// TODO Auto-generated constructor stub
	}

	public void setLotto(int[][] lotto, int[] wLotto) {
		this.lotto = lotto;
		this.wLotto=wLotto;
	}
	
	public int[] getRank() {
		return rank;
	}

	public void compare() {
		rank = new int[lotto.length];
		for (int i = 0; i < lotto.length; i++) {
			int nCount = 0;
			
			for (int j = 0; j < lotto[i].length - 1; j++) {
				for (int k = 0; k < wLotto.length - 1; k++) {
					if (lotto[i][j] == wLotto[k]) {
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
				if (lotto[i][6] == wLotto[6]) {
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
				rank[i] = 6;
				break;
			}
		}
	}
}
