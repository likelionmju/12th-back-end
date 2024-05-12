
public class Ticket {
	
	private int[][] lotto;
	public Ticket() {
	
	}
	
	public void setLotto(int[][] lotto) {
		this.lotto = lotto;
	}
	
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
