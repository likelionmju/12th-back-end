package week05lotto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Integer> winningNumbers;
    private int bonusNumber;
    public ArrayList<Integer> getWinningNumbers() {
        return winningNumbers;
    }
    public int getBonusNumber() {
        return bonusNumber;
    }
    public Main(){
        ReadFile readFile = new ReadFile();

        this.winningNumbers=readFile.setWinningNumbers();
        this.bonusNumber= readFile.setBonusNumber();
    }


    public static void main(String[] args) {
        Main m = new Main();
        Casher casher = new Casher();
        LottoMachine l = new LottoMachine();


        l.Lotto(casher.ticket()); //내가 구매한 로또 수만큼 로또 생성 후 저장
        //내 로또 번호와 당첨 번호를 비교
        Evaluator evaluator = new Evaluator(m.getWinningNumbers(), m.getBonusNumber());
        Counter counter = evaluator.evaluateLottos(l.getMyLottos());
        //당첨 결과 출력
        evaluator.showResults(counter, casher.getMoney());

        System.out.println("당첨 번호: " + m.winningNumbers);
        System.out.println("보너스 번호: " + m.bonusNumber);
    }
}






