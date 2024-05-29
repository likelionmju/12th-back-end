import java.util.ArrayList;
import java.util.List;

public class Lotto {
    private List<Integer> list;
    public Lotto(){
        this.list= new ArrayList<>(6);
    }
    public void add(int num){
        this.list.add(num);
    }
    public List<Integer> getList(){
        return list;
    }
}
