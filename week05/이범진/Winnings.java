import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Winnings {
	private int[] wLotto;

	public Winnings() {
		wLotto = new int[7];

	}

	public void readWinnin() {
		// 파일에서 1등 번호 읽어오기
		try {
			Scanner sc = new Scanner(new File("data/number"));
			for (int i = 0; sc.hasNext(); i++) {
				wLotto[i] = sc.nextInt();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 1등 번호 출력
		System.out.println("::: 이번 주 로또1등 번호 :::");
		for (int i = 0; i < wLotto.length; i++) {
			
			if (i <= wLotto.length - 2) {
				System.out.print(wLotto[i]+ " ");
			}else {System.out.println(" :보너스 번호: "+wLotto[i]);
				System.out.println(" ");
			}
			
		}
	}

	public int[] getWLotto() {
		return wLotto;
	}
}
