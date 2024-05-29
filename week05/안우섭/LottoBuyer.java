import java.util.Scanner;

// 로또 구매자 클래스
class LottoBuyer {
  private Scanner scanner = new Scanner(System.in);

  // 사용자가 구매 금액을 입력하게 하고, 1000원 단위로 입력했는지 확인
  public int enterPurchaseAmount() {
    int amount;
    while (true) { // 문자입력시 예외처리
      System.out.print("로또 구매 금액을 입력하세요 (1000원 단위): ");
      amount = scanner.nextInt();
      if (amount % 1000 == 0 && amount > 0) {
        break;
      }
      System.out.println("잘못된 금액입니다! 1000원 단위로 입력해야 합니다.");
    }
    return amount;
  }
}