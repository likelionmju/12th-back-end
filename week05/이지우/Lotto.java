import java.util.*;
public class Lotto {

	private static List<Integer> issue_number_set;
	
	private int issue_number_cnt=6; //발행 번호 개수
	public Lotto() {
		this.issue_number_set = new ArrayList<>(issue_number_cnt);
	}
	
	public void add(int num) {
		this.issue_number_set.add(num);
	}
	
	public List<Integer> getList(){
		return issue_number_set;
	}
	
	public static boolean check_duplication(int num) {
		for(int value:issue_number_set) {
			if(value == num) {
				return true;
			}				
		}
		return false;
	}
	public void print() {
		for(int i=0;i<issue_number_set.size();i++) {
			System.out.print(issue_number_set.get(i));
		}
	}
}
