import java.util.List;

// 로또 판매원 클래스
class LottoSeller {
  private LottoTicketIssuer issuer = new LottoTicketIssuer(); // 로또 티켓을 발행하는 LottoTicketIssuer 객체

  public List<LottoTicket> provideTickets(int purchaseAmount) { // 구매 금액에 따라 티켓을 발행기에서 받아 제공
    int numberOfTickets = calculateTickets(purchaseAmount); // 티켓 개수 계산 후
    return issuer.issueTickets(numberOfTickets); // 발행기에 개수 전해주기
  }


  // 구매 금액을 기반으로 발행할 티켓 개수를 계산
  private int calculateTickets(int purchaseAmount) { // 티켓 개수 계산 메소드
    return purchaseAmount / 1000;
  }
}