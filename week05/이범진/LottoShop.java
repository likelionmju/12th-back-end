import java.util.InputMismatchException;
import java.util.Scanner;

public class LottoShop {
	
	private int charge;
	
	public LottoShop(){
		
	}
	//구매하고자 하는 로또 금액 받기
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		charge = 0;

		try {
			System.out.println("로또를 구입하고자 하는 금액을 입력하세요.");
			charge = sc.nextInt();
			
			//1000원 단위가 아닐때
			if (charge % 1000 != 0) {
				System.out.println("로또는 1000원 단위로만 구매 가능합니다. 다시 입력해주세요.");
				deposit();
				;
			}
			// 받은 금액을 로또 매 수로 변경
			else {
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
