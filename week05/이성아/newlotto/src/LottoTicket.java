import java.util.ArrayList;
import java.util.List;

public class LottoTicket {
    private List<Integer> list;
    public LottoTicket() {
        this.list= new ArrayList<>(6);
    }
    public void add(int num) {
        this.list.add(num);
    }
    public List<Integer> getList() {
        return list;
    }
    public boolean contains(int number) {
        return list.contains(number);
    }
}