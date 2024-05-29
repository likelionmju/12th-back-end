import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoNumGenerator {
	
	private int charge;
	private int[][] lotto; 
	
	final int maxNum = 46;
	final int minNum = 1;
	
	public LottoNumGenerator() {
	}
	
	//로또 장 수 저장 
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	public int[][] getLotto() {
		return lotto;
	}
	
	
	public void generateNum() {
		int count = charge;
		SecureRandom random = new SecureRandom();
		//로또 몇 장, 번호의 2차원 배열 
		lotto = new int[count][7];
		for (int i = 0; i < count; i++) {
			Set<Integer> drawnNumbers = new HashSet<>();
			for (int j = 0; j < 7; j++) {
				int num;
				do {
					//0~(maxNum-minNum-1)까지 무작위 정수 생성 + minNum을 통해 범위 조정
					num = random.nextInt(maxNum-minNum) + minNum;
				}//중복되지 않은 번호가 나올 때까지 계속 진행 
				while (drawnNumbers.contains(num));
				drawnNumbers.add(num);
				lotto[i][j] = num;
			}
		}
	}
}
