import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumberGenerator {
	
	public NumberGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCharge() {
		
	}
	
	private void drawNum() {
		Random random = new Random();
		lotto = new int[count][7];
		for (int i = 0; i < count; i++) {
			Set<Integer> drawnNumbers = new HashSet<>();
			for (int j = 0; j < 7; j++) {
				int num;
				do {
					num = random.nextInt(45) + 1;
				} while (drawnNumbers.contains(num));
				drawnNumbers.add(num);
				lotto[i][j] = num;
			}
		}

		return lotto;
	}
}
