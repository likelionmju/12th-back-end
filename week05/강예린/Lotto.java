package LottoProject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lotto {
    // 한 장의 로또를 중복 없이 set으로 !
    private Set<Integer> lotto;
    // 보너스 넘버 !
    private int bonusNum;

    // 생성사 실행시 lotto 객체와 로또 번호 생김
    public Lotto(){
        lotto= new HashSet<>();
        randomNum();
    }

    // getter들
    public int getBonusNum() {
        return bonusNum;
    }

    public Set<Integer> getLotto() {
        return lotto;
    }

    // 1개의 로또 만들기- 6개의 기본 숫자와 1개의 보너스 숫자
    private void randomNum(){
        while(lotto.size()!=6){
            lotto.add((int)(Math.random()*45+1));
        }
        do {
            bonusNum= (int)(Math.random()*45+1);
        }
        while (lotto.contains(bonusNum));

            }


}
