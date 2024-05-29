import java.util.ArrayList;
import java.util.List;

public class LottoMachine {
    public List<LottoTicket> purchaseTickets(int totalAmount) {
        int numTickets = totalAmount / 1000;
        List<LottoTicket> tickets = new ArrayList<>();
        for (int i = 0; i < numTickets; i++) {
            tickets.add(new LottoTicket());
        }
        return tickets;
    }
}
