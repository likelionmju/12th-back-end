package LottoProject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lottos {

    private List<Lotto> lottos;
    
    // 로또들을 관리할 lottos 생성자는 티켓을 구매한 후 시작
    public Lottos(Ticket t){
        lottos= new ArrayList<>();
        generateLottos(t);
        printLotto(t);
    }
    
    public List<Lotto> getLottos() {
        return lottos;
    }
    
    // 티켓의 수 만큼 for문을 돌려서 lottos에 lotto를 만들어 저장
    private void generateLottos (Ticket t){
        for (int i=0; i< t.getTicketCount(); i++){
            lottos.add(new Lotto());
        }
    }
    
    // for each 이용하여 구매 장 수와 로또 번호 출력하는 메소드 호출
    private void printLotto(Ticket t){
        System.out.println( t.getTicketCount()+"장 구매하셨습니다.");
        for (Lotto l : lottos){
            printNum(l);
        }

    }
    // 로또 번호 출력하는 메소드
    private void printNum(Lotto l) {
        Iterator<Integer> it= l.getLotto().iterator();
        while(it.hasNext()){
            int num = it.next();
            System.out.print(num+" ");
        }
        System.out.println("+"+l.getBonusNum());
    }
}
