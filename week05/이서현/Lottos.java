import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private List<Lotto> lottos;
    public Lottos(){
        this.lottos = new ArrayList<>();
    }

    public void add(Lotto lotto) {
        this.lottos.add(lotto);
    }
    public int getLenght(){
        return this.lottos.size();
    }
    public Lotto getLotto(int i){
        return lottos.get(i);
    }

    public void print() {
        for(int i=0; i<lottos.size(); i++){
            System.out.println(lottos.get(i).getList());
        }
    }
}
