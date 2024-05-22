import java.util.*;

public class Lottos {
	
//private static List<Integer> issue_number_set;
	
	//private static List<Integer> issue_number_set;
	//private int issue_number_cnt=6; //발행 번호 개수
	//public Lotto() {
	//	this.issue_number_set = new ArrayList<>(issue_number_cnt);
	//}
	
	private int[][] lotto_Num;  // 발행 번호 배열

	//private static List<Lotto> issue_number_set_list;
	
	//public Lottos() {this.issue_number_set_list = new ArrayList<>(100);}
	
	public Lottos() {}
	/*
	public void add(Lotto lotto_set) {
		this.issue_number_set_list.add(lotto_set);
	}
	
	public int getLength() {
		return this.issue_number_set_list.size();
	}
	
	public Lotto getLotto(int i) {
		return issue_number_set_list.get(i);
	}
	*/
	/*
	public void print() {
		//for(int i=0;i<issue_number_set_list.size();i++) {
		//	System.out.println(issue_number_set_list.get(i));
			
		//}
		for(Lotto value:issue_number_set_list) {
			System.out.print(issue_number_set_list.get(1).getList());     
			//System.out.println(value.print());
		//	System.out.println(value.getList());
			//issue_number_set_list.
		}	
		000000
		000000
		000000
		   :
		000000			
	}
	*/
	/*
	public List<Lotto> getList(){
		return issue_number_set_list;
	}
	*/
	public int[] getNumArray(int idx) {
		return lotto_Num[idx];
	}
	public int getNumofArrary(int i, int j) {
		return lotto_Num[i][j];
	}
	public void makeNumArray(int issue_cnt) {
		lotto_Num = new int[issue_cnt][6]; // 발행 매수만큼 배열 선언
	}
}
