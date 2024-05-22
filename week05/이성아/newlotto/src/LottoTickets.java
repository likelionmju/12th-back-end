import java.util.ArrayList;
import java.util.List;

public class LottoTickets {
    private List<LottoTicket> LottoTickets;
    public LottoTickets(){
        this.LottoTickets = new ArrayList<>();
    }

    public void add(LottoTicket lottoTicket) {
        this.LottoTickets.add(lottoTicket);
    }
    public int getLenght() {
        return this.LottoTickets.size();
    }
    public LottoTicket getLotto(int i){
        return LottoTickets.get(i);
    }

    public void print() {
        for(int i=0; i<LottoTickets.size(); i++){
            System.out.println(LottoTickets.get(i).getList());
        }
    }
}
