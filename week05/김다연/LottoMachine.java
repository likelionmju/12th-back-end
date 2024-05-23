package week05lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class LottoMachine {
    private ArrayList<ArrayList<Integer>> myLottos;
    private static final int MAX_NUMBER = 45;
    private static final int TICKET_SIZE = 6;
    public LottoMachine() {
        this.myLottos = new ArrayList<>();
    }

    // 자동으로 로또 번호를 생성하는 메소드
    public ArrayList<Integer> autoLotto() {
        ArrayList<Integer> numbers = new ArrayList<>();

        //배열 number에 숫자 1-45 저장
        Integer[] number = new Integer[MAX_NUMBER];
        for (int i = 0; i < MAX_NUMBER; i++) {
            number[i] = i + 1;
        }
        //1-45를 배열리스트 numbers에 삽입
        numbers.addAll(Arrays.asList(number));
        //1-45 셔플
        Collections.shuffle(numbers);

        ArrayList<Integer> mylotto = new ArrayList<>(numbers.subList(0, TICKET_SIZE));
        //1-45 셔플 한 것 중 앞에서 6개 추출-> 내 로또 번호 mylotto
        Collections.sort(mylotto);

        return mylotto;
    }
    private ArrayList<ArrayList<Integer>> mylottos = new ArrayList<>();
    // 자동 로또를 구매한 수량만큼 제공하는 메소드
    public ArrayList<ArrayList<Integer>> autoLottos(int numberOfticket) {
        for (int j = 0; j < numberOfticket; j++) {
            mylottos.add(autoLotto());
            //mylottos배열리스트에 로또수량만큼 autolotto 생성해서 엘리먼트로 삽입
        }
        return mylottos;
    }

    //내가 산 로또를 최종 저장하는 메소드
    public void Lotto(int ticketCount) {
        this.myLottos = autoLottos(ticketCount);
    }

    public ArrayList<ArrayList<Integer>> getMyLottos() {
        return myLottos;
    }
}

