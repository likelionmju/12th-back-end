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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        Casher casher = new Casher();
        LottoMachine l = new LottoMachine();
        ReadFile file = new ReadFile();

        ArrayList<Integer> FileNumebrs = file.readNumbersFromFile("C:\\Users\\dayx7\\IdeaProjects\\untitled1\\src\\week05lotto\\input.txt");

        if (FileNumebrs.size() < 7) {
            System.out.println("파일에 적절한 수의 숫자가 없습니다. 7개의 숫자가 필요합니다.");
            return;
        }
        //삼항연산자 써본경우
        // String text = FileNumebrs.size() < 7 ? "파일에 적절한 수의 숫자가 없습니다. 7개의 숫자가 필요합니다." : "";
        // System.out.println(text);

        // 6개의 당첨 번호와 1개의 보너스 번호로 분리
        m.winningNumbers = new ArrayList<>(FileNumebrs.subList(0, 6));
        m.bonusNumber = FileNumebrs.get(6);

        System.out.println("금액을 지불하세요.(1000원 단위)");
        casher.pay(sc.nextInt());
        casher.numberOfticket();

        l.Lotto(casher.ticket()); //내가 구매한 로또 수만큼 로또 생성 후 저장
        //내 로또 번호와 당첨 번호를 비교
        Evaluator evaluator = new Evaluator(m.getWinningNumbers(), m.getBonusNumber());
        Counter counter = evaluator.evaluateLottos(l.getMyLottos());
        //당첨 결과 출력
        evaluator.showResults(counter, casher.pay());

        System.out.println("당첨 번호: " + m.winningNumbers);
        System.out.println("보너스 번호: " + m.bonusNumber);
    }
}






