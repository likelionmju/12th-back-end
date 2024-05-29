import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// 로또 발행기 클래스, (로또 티켓을 발행)
class LottoTicketIssuer {

  // issueTickets메서드 : 지정된 개수만큼 LottoTicket 객체 리스트를 생성하고, 각 티켓에 1~45 사이의 난수를 할당
  public List<LottoTicket> issueTickets(int count) { //LottoTicket 객체들의 리스트
    List<LottoTicket> tickets = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < count; i++) { // 발행할 티켓의 개수만큼 반복문을 실행
      Set<Integer> numbers = new TreeSet<>();
      while (numbers.size() < 6) {
        int number = random.nextInt(45) + 1; // 1~45 난수 생성
        numbers.add(number); // 번호(난수) 추가
      }
      tickets.add(new LottoTicket(numbers)); // 리스트에 완성된 티켓(numbers) 더하기
      System.out.println("발행된 로또 티켓: " + numbers); // 로또 출력하기
    }
    return tickets; // 로또 티켓 발행, List<LottoTicket> tickets
  }
}
