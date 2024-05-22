import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class LottoMaker {
	//Lotto lotto = new Lotto();
	Lottos lottos = new Lottos();
	private int num_of_lotto=0; // 로또 개수
	private int total_profit=0; // 총수익
	private int real_Num[] = new int[7]; // 당첨 번호
	public void set_num_of_lotto(int cnt) {
		num_of_lotto = cnt;
	}
	
	public int get_num_of_lotto()
	{
		return num_of_lotto;
	}
	
	public int get_total_profit()
	{
		return total_profit;
		
	}
	
	public void issue_lotto() {
		lottos.makeNumArray(num_of_lotto); 
		for(int i=0;i<num_of_lotto;i++) {
			get_RandomNumbers(lottos.getNumArray(i)); // lottos에 선언된 2차원 배열에 각 열의 시작 주소를 받아옴 6개씩 넘겨줌 
			
			for(int j=0;j<6;j++) {
				System.out.print(lottos.getNumofArrary(i,j)+" "); // 발행번호 6개 출력
			}
			System.out.println();
		}
		System.out.println("총 발행 매수: "+num_of_lotto+"장");
	}
	
	private boolean get_RandomNumbers(int array[]) {
		Random random = new Random(); // 난수 발생을 위한 랜덤 객체 생성
		int random_Num=0;
		for(int j=0;j<6;j++) {
			random_Num = random.nextInt(45)+1;			
			array[j] = random_Num;			
		} 
		// 중복 검사 체크
		for(int k=0;k<6;k++) {
			for(int h=0;h<6;h++) {
				if(k!=h) {
					if(array[k]==array[h]) {
						//System.out.println("중복 번호: "+array[k]+" "+array[h]);
						return false;
					}
				}
			}
		}
		return true;
	
	}
	
	public boolean read_JackPotNumber() {
		FileReader fin = null;
		int idx=0;
		
		//CharBuffer buf;
		int cnt=0;
		try { // 파일에 저장된 단첨 번호 문자 개수 확인
			fin = new FileReader("G:\\멋쟁이사자처럼 세션\\reallottonumber.txt");
			int c;
			while((c=fin.read())!=-1) { // 파일에 한글자씩 읽어오면서 문자 개수 확인
				cnt++;
				//System.out.println(chBuffer);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		char chBuffer[] = new char[cnt-1]; // 파일 크기(당첨 번호 문자 개수)에 따른 배열 사이즈 계산
		try {
			fin = new FileReader("G:\\멋쟁이사자처럼 세션\\reallottonumber.txt");
			fin.read(chBuffer); // 문자열 전체를 한번에 읽어서 저장
			System.out.print("당첨 번호: ");
			System.out.println(chBuffer);
			
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		// String을 공백으로 split해서 String 배열에 저장
		String sentence = new String(chBuffer);
		String[] jpNumString = sentence.split("\\s+");
		idx=0;
		// 저장된 당첨번호 문자열을 정수형 배열에 저장
		for(String word : jpNumString) {
			real_Num[idx++] = Integer.parseInt(word);
			//System.out.print(jpArray[idx-1]+",");
			//System.out.println();
		}
		// 중복 번호 확인
		for(int k=0;k<7;k++) {
			for(int h=0;h<7;h++) {
				if(k!=h) {
					if(real_Num[k]==real_Num[h]) {
						System.out.println("중복 번호: "+real_Num[k]+" "+real_Num[h]);
						return false;
					}
				}
			}
		}
		
		
		return true;
	}
	
	
	public void check_JackPotNumber() {
		// 당첨 내역 확인
		int match_cnt=0;
		int bonus_cnt=0;
		
		for(int i=0;i<num_of_lotto;i++) { // 발행 매수
			for(int j=0;j<6;j++) { // 발행 번호 6개 비교
				for(int k=0;k<7;k++) { // 당첨 번호 7개 비교
					if(lottos.getNumofArrary(i,j) == real_Num[k]) { // real_Num 파일에서 불러온 것, getNumofArray는 2차원 배열에서 불러온 것
						if(k!=6) { // 보너스 번호가 아닌지 확인
							match_cnt++; // 당첨 번호 일치
						}
						else
							bonus_cnt++; // 보너스 번호 일치
					}
				}
			}
			//System.out.println(match_cnt);
			// 일치 번호 개수에 따른 당첨 금액 누적
			if(match_cnt==6) {
				System.out.println("1등 2,000,000,000원");
				total_profit += 2000000000.0;
			}
			else if(match_cnt==5 && bonus_cnt==1) {
				System.out.println("2등 30,000,000원");
				total_profit += 30000000.0;
			}
			else if(match_cnt==5) {
				System.out.println("3등 1,500,000원");
				total_profit += 150000.0;
			}
			else if(match_cnt==4) {
				System.out.println("4등 50,000원");
				total_profit += 50000.0;
			}
			else if(match_cnt==3) {
				System.out.println("5등 5000원");
				total_profit += 5000.0;
			}
			
			match_cnt=0;
			bonus_cnt=0;
		}
	}


}
