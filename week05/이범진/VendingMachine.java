import java.util.InputMismatchException;
import java.util.Scanner;

public class VendingMachine {
	Scanner sc = new Scanner(System.in);

	public int charge;
	public VendingMachine() {

	}
	public int getCash() {
		return charge;
	}
	
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		charge = 0;

		try {
			System.out.println("로또를 구입하고자 하는 금액을 입력하세요.");
			charge = sc.nextInt();

			if (charge % 1000 != 0) {
				System.out.println("로또는 1000원 단위로만 구매 가능합니다. 다시 입력해주세요.");
				deposit();
				;
			} else {
				charge = charge / 1000;
			}

			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("숫자로만 금액을 입력해 주시기 바랍니다.");
			deposit(); // 다시 입력 받기

		}
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
			System.out.println(""); // 한 행의 출력이 끝나면 개행
		}
		}
		
		public void showRank(int[] rank) {
			
			double profit = 0;
			int min = rank[0];

			for (int i = 1; i < rank.length; i++) {
				if (rank[i] < min) {
					min = rank[i];
				}
			}
			charge *= 1000;
			switch (min) {
			case 1:
				profit = 2000000000 - charge*1000;
				break;
			case 2:
				profit = 30000000 - charge*1000;
				break;
			case 3:
				profit = 1500000 - charge*1000;
				break;
			case 4:
				profit = 50000 - charge*1000;
				break;
			case 5:
				profit = 5000 - charge*1000;
				break;
			default:
				// 이외의 등수일 경우 손실
				profit = 0 - charge; // 손실 표시 (음수)
				break;
			}

			double profitRate = Math.round((profit / charge) * 100);

			System.out.println("당신은 " + min + "등에 당첨되셨습니다. 당신의 수익률은 " + profitRate + "입니다.");
		}
	
	}
