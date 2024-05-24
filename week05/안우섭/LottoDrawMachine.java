import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
// 로또 당첨번호 추첨기 클래스
class LottoDrawMachine {
//발행된 로또 티켓을 추첨하고 당첨을 확인
//당첨 번호를 생성하고 발행된 로또 티켓의 당첨 여부를 확인
  private TreeSet<Integer> winningNumbers; // 당첨 번호를 저장, TreeSet은 자동 정렬 기능
  private int bonusNumber; // 보너스 번호를 저장하는 정수 변수

  public LottoDrawMachine() { // 파일에서 당첨 번호를 읽어와 초기화
        winningNumbers = new TreeSet<>();

        try {
          // 파일을 읽어들일 Scanner 생성
          Scanner scanner = new Scanner(new File("C:\\Users\\82102\\IdeaProjects\\first\\src\\당첨번호.txt"));
          scanner.useDelimiter(",\\s*"); // 숫자 구분자를 ","로 설정

      // 파일에서 번호를 읽어와 winningNumbers에 추가
      while (scanner.hasNextInt()) {
        int number = scanner.nextInt(); // 정수로 번호를 읽어옴
        // 마지막 번호인 경우 보너스 번호로 설정
        if (!scanner.hasNextInt()) {
          bonusNumber = number;
        } else {
          winningNumbers.add(number);
        }
      }

      // Scanner 닫기
      scanner.close();
    } catch (FileNotFoundException e) {
      // 파일 읽기 예외 처리
      e.printStackTrace();
    }

    // 당첨 번호 출력
    System.out.println("당첨 번호: " + winningNumbers + " 보너스 번호: " + bonusNumber);
  }

  //발행된 티켓의 당첨 여부를 확인하고 총 당첨금을 계산
  public void checkTickets(List<LottoTicket> tickets) { // 추첨기 클래스의 당첨 확인하는 메소드
    long totalPrize = 0; // 총 당첨금 초기화
    for (LottoTicket ticket : tickets) { // 티켓 개수만큼 loop 돌기
      Set<Integer> numbers = new HashSet<>(ticket.getNumbers()); // hashSet에 저장
      boolean bonusMatch = numbers.remove(bonusNumber); // hashSet에서 보너스번호 제거
      numbers.retainAll(winningNumbers); // (hash)Set메소드 retainAll 다른 집합과 겹치지 않는 원소들을 모두 제거
      int matchCount = numbers.size(); // 몇개 같은지 matchCount에 저장

      long prize = calculatePrize(matchCount, bonusMatch); // 상금 계산하기, 몇개 같은지, 보너스 따로
      if (prize > 0) {
        System.out.println("당첨 티켓: " + ticket.getNumbers() + ", 일치하는 번호: " + matchCount + (bonusMatch ? " + 보너스" : "") + ", 당첨금: ₩" + prize);
      }
      totalPrize += prize; // 상금 누적
    }
    System.out.println("총 당첨금: ₩" + totalPrize);
    calculateAndPrintProfit(totalPrize); // 수익률 계산 및 출력
  }

  //수익률을 계산하고 출력
  private void calculateAndPrintProfit(long totalPrize) {
    int purchaseAmount = LottoSystem.getPurchaseAmount();
    double profitPercentage = ((double) totalPrize / purchaseAmount) * 100; // 총 상금 / 구매 금액
    System.out.printf("구매 금액: ₩%d, 총 당첨금: ₩%d, 수익률: %.1f%%\n",
        purchaseAmount, totalPrize, Math.round(profitPercentage * 10) / 10.0);
  }

  //일치하는 번호 개수와 보너스 여부에 따라 상금을 계산
  private long calculatePrize(int matchCount, boolean bonusMatch) {
    switch (matchCount) {
      case 6: return 2_000_000_000; // 1등
      case 5:
        if (bonusMatch) return 30_000_000; // 2등 (5개+보너스)
        return 1_500_000; // 3등 (5개)
      case 4: return 50_000; // 4등 (4개)
      case 3: return 5_000; // 5등 (3개)
      default: return 0;
    }
  }


}