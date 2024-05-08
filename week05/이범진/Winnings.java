import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Winnings {
	private int[] wNum = new int[7]; 
	
	public void readWinnin () {
		try {
			Scanner sc = new Scanner(new File("data/number"));
			for (int i = 0; sc.hasNext(); i++) {
			    wNum[i] = sc.nextInt();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int[] getWNum() {
		return wNum;
	}
}
