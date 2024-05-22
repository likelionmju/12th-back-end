import java.util.Set;

// 로또 티켓 클래스
class LottoTicket {
  private Set<Integer> numbers; //Set<Integer> 컬렉션, 중복된 번호를 사용하지 않기 위해
                                //티켓에 있는 숫자를 나타내는 정수 집합


  //LottoTicket 생성자: 숫자 집합으로 티켓을 초기화
  public LottoTicket(Set<Integer> numbers) { // 생성자
    this.numbers = numbers;
  }


  //티켓의 숫자 집합을 반환
  public Set<Integer> getNumbers() {  //getter
    return numbers;
  }
}