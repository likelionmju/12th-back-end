import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LottoCalculator {
    private int winning;
    private Scanner scanner;
    private Lotto answerLotto;
    private int bonus;
    public LottoCalculator(String sourceFile) {
        try {
            File file = new File(sourceFile);
            this.scanner = new Scanner(file);
            this.answerLotto = new Lotto();

            for(int i=0; i<6; i++) {
                int answer = scanner.nextInt();
                this.answerLotto.add(answer);
            }
            System.out.println("당첨 번호:");
            System.out.println(answerLotto.getList());
            this.bonus = scanner.nextInt();
            System.out.println("bonus 번호: "+bonus);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    enum WinningStandard{
        FirstPlace(6,2000000000),
        SecondPlace(5.5,30000000),
        ThirdPlace(5,1500000),
        FourthPlace(4,50000),
        FifthPlace(3,5000),
        Missingno(0,0);
        private double num;
        private int price;
        WinningStandard(double num, int price){
            this.num = num;
            this.price = price;
        }
        public static WinningStandard getWinningStandard(double num){
           return Arrays.stream(WinningStandard.values())
                   .filter(x-> x.num==num)
                   .findAny()
                   .orElse(Missingno);
        }
        public static int getWinningPrice(double num){
            return getWinningStandard(num).getPrice();
        }
        public int getPrice(){
            return this.price;
        }
    }

    public int getWinning(Lottos lottos) {
        for(int i=0; i<lottos.getLenght(); i++){
            winning += calculate(lottos.getLotto(i));
        }
        return this.winning;
    }

    private int calculate(Lotto lotto) {
        int numOfAnswer=0;
        for(int i=0; i<6; i++){
            if(this.answerLotto.getList().contains(lotto.getList().get(i))){
                numOfAnswer++;
            }
        }
        if(numOfAnswer<3){
            numOfAnswer=0;
        }
        if(numOfAnswer!=5) {
            return WinningStandard.getWinningPrice(numOfAnswer);
        }
        if(lotto.getList().contains(bonus)){
            return WinningStandard.getWinningPrice(5.5);
        }
        return WinningStandard.getWinningPrice(5);
    }
}
