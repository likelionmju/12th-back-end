package LottoProject;

public class Main {
    public Main(){
        Purchase p= new Purchase();
        Ticket t= new Ticket(p);
        Lottos l= new Lottos(t);
        Matching m= new Matching(l);
        Profit pr= new Profit(p,m);
    }
    public static void main(String[] args) {
        Main main= new Main();
    }
}
