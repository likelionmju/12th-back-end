import java.util.*;

public class Lottos {

	private List<Lotto> issue_number_set_list;
	
	public Lottos() {this.issue_number_set_list = new ArrayList<>();}
	
	public void add(Lotto lotto_set) {
		this.issue_number_set_list.add(lotto_set);
	}
	
	public int getLength() {
		return this.issue_number_set_list.size();
	}
	
	public Lotto getLotto(int i) {
		return issue_number_set_list.get(i);
	}
	
	public void print() {
		for(int i=0;i<issue_number_set_list.size();i++) {
			issue_number_set_list.get(i).print();
			System.out.println("---------------------");
		}
	}
}
