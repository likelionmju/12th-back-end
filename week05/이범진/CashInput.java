import java.util.InputMismatchException;
import java.util.Scanner;

public class CashInput {
	
	private int charge;
	
	public CashInput(){
		
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
	public int getCharge() {
        return charge;
    }
}
