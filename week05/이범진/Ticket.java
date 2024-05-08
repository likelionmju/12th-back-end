
public class Ticket {
	
	public Ticket() {
	
	}
	
	public void showTicket(int[][] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto[i].length; j++) {
				if (j < lotto[i].length - 1)
					System.out.print(lotto[i][j] + " ");
				else {
					System.out.println(" :보너스번호: " + lotto[i][j]);
				}
			}
			System.out.println(); // 한 행의 출력이 끝나면 개행
		}
	}
}
