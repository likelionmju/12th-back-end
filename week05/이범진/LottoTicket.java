
public class LottoTicket {
	
	private int[][] lotto;
	public LottoTicket() {
	
	}
	
	public void setLotto(int[][] lotto) {
		this.lotto = lotto;
	}
	//번호 6개까지가 정규 번호, 나머지 하나가 보너스 번호
	public void showTicket() {
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				if (j < lotto[i].length - 1)
					System.out.print(lotto[i][j] + " ");
				else {
					System.out.println(" :보너스번호: " + lotto[i][j]);
				}
			}
			System.out.println(); 
		}
	}
}
