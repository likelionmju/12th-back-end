import java.util.ArrayList;

public class LottoShop {
    private LottoCreator lottoCreator;
    private LottoCasher lottoCasher;
    private LottoCalculator lottoCalculator;
    private int numOfLotto;
    private int winning;
    public LottoShop(){
        this.lottoCreator = new LottoCreator();
        this.lottoCasher = new LottoCasher();
        this.lottoCalculator = new LottoCalculator("back-end-lotto/data/answer.txt");
        this.numOfLotto = 0;
        this.winning = 0;
    }
    public void start() {
        this.numOfLotto += lottoCasher.getMoney();
        System.out.println("입력한 금액: "+ this.numOfLotto);
        Lottos lottos = lottoCreator.create(numOfLotto);
//        테스트
//        Lottos lottos = new Lottos();
//        Lotto lotto =new Lotto();
//        lotto.add(1);
//        lotto.add(2);
//        lotto.add(3);
//        lotto.add(4);
//        lotto.add(5);
//        lotto.add(7);
//        lottos.add(lotto);
        System.out.println("구매한 로또:");
        lottos.print();
        this.winning += lottoCalculator.getWinning(lottos);
        System.out.println("상금: "+ this.winning);
        float rateOfReturn = payCalculate(numOfLotto,winning);
        System.out.println("수익률 : "+ rateOfReturn);
    }
    private float payCalculate(int price, int winning){
        float rateOfReturn = (winning-price/price)*100;
        if(rateOfReturn<0){
            rateOfReturn = -rateOfReturn;
        }
        return Math.round(rateOfReturn*100)/100;
    }
}
