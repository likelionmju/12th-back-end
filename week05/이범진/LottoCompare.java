
public class LottoCompare {
	private int[][] lotto;
	private int[] rank;
	private int[] wLotto;
	
	public LottoCompare() {
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
		//각 로또 티켓의 등수를 저장하기 위한 배열 생성 
		rank = new int[lotto.length];
		for (int i = 0; i < lotto.length; i++) {
			// 1등 번호와 일치하면 숫자 세줄 변수 
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
				//보너스 번호 비교
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
