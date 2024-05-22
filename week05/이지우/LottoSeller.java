import java.util.Scanner;

public class LottoSeller {
	
	public LottoSeller() {}
	LottoMaker lm = new LottoMaker();
	float purchase_amout=0;
	int total_profit =0;
	float rate_of_profit=0;

	public void sell_lotto()
	{
		input_Money();
		issue_Lotto();
	}
	public void calc_lotto()
	{
		if(lm.read_JackPotNumber()) {
			lm.check_JackPotNumber();
			calculate_profit_rate();
		}
	}
	
	public void input_Money() {
		Scanner scanner = new Scanner(System.in);
		while(true) {			
			System.out.print("금액을 입력하세요: ");
			purchase_amout = scanner.nextInt();
			if(purchase_amout % 1000 == 0)
				break;
			else
				continue;
		}
		scanner.close();
		lm.set_num_of_lotto((int)purchase_amout/1000); // 로또를 몇장 발행할 지 LottoMaker에 전달
	}
	
	public void issue_Lotto() {
		lm.issue_lotto();
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	public int get_IssueCount()
	{
		return lm.get_num_of_lotto();
	}
	
	public void calculate_profit_rate() {
		total_profit = lm.get_total_profit();
		//int rate_of_profit=0;
		if(total_profit==0) {
			System.out.println("수익률: 0%");
		}
		else {
			rate_of_profit = (total_profit / purchase_amout*100);
			System.out.printf("수익률: %.1f%%",rate_of_profit);
		}
	}

}
