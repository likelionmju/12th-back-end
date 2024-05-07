import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		float price=0;
		Scanner scanner = new Scanner(System.in);
		while(true) {			
			System.out.print("금액을 입력하세요: ");
			price = scanner.nextInt();
			if(price % 1000 == 0)
				break;
			else
				continue;
		}
		lotto.set_purchase_amount(price); // 구매 금액 설정
		lotto.issue_lotto(); // 로또 번호 발행
		lotto.read_JackPotNumber(); // 당첨 번호 읽어오기
		lotto.check_JackPotNumber(); // 당첨 번호 확인 및 당첨 금액 계산
		lotto.calculate_profit_rate(); // 수익률 계산
		scanner.close();
	}

}


