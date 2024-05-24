package LottoProject;

import java.util.Scanner;

public class Ticket {
    // 몇장을 샀는지
    private final int ticketCount;
    public int getTicketCount() {
        return ticketCount;
    }

    public Ticket(Purchase p){
        this.ticketCount= p.getPayment()/1000;
    }
}
