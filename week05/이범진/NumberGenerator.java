import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumberGenerator {
	
	private int charge;
	private int[][] lotto; 
	
	final int maxNum = 46;
	final int minNum = 1;
	
	public NumberGenerator() {
	}
	
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	public int[][] getLotto() {
		return lotto;
	}
	
	public void drawNum() {
		int count = charge;
		SecureRandom random = new SecureRandom();
		lotto = new int[count][7];
		for (int i = 0; i < count; i++) {
			Set<Integer> drawnNumbers = new HashSet<>();
			for (int j = 0; j < 7; j++) {
				int num;
				do {
					num = random.nextInt(maxNum-minNum) + minNum;
				} while (drawnNumbers.contains(num));
				drawnNumbers.add(num);
				lotto[i][j] = num;
			}
		}
	}
}
