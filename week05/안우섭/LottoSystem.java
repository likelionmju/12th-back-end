import java.util.*;

// 메인 클래스
public class LottoSystem {
  private static int purchaseAmount; // 사용자가 로또 티켓에 쓸 총 금액을 저장


  public static void main(String[] args) {
    // LottoBuyer, LottoSeller, LottoDrawMachine의 인스턴스를 생성
    //  티켓 구매 및 확인 과정
    LottoBuyer buyer = new LottoBuyer(); // 구매자 객체 생성
    LottoSeller seller = new LottoSeller(); // 판매자 객체 생성 
    LottoDrawMachine drawMachine = new LottoDrawMachine(); // 추첨기 객체 생성

    purchaseAmount = buyer.enterPurchaseAmount(); // 구매자의 총 구매 금액
    List<LottoTicket> tickets = seller.provideTickets(purchaseAmount); // 판매자에게 총 구매 금액 전달 후, 티켓 출력
    drawMachine.checkTickets(tickets); // 추첨기가 티켓보고, 당첨확인
  }
  public static int getPurchaseAmount() {
    return purchaseAmount;
  }
}
