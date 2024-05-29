package lotto;

public class LottoMachine {

    public void run(){
        // 로또 구매
        LottoPurchase lottoPurchase = new LottoPurchase();

        // 추첨 로또 발행
        LottoGenerator lottoGenerator = new LottoGenerator(lottoPurchase.getAmount());
        lottoGenerator.showGeneratedLottoNum();

        // 로또 결과
        LottoResult lottoResult = new LottoResult(lottoGenerator.getGeneratedLottoArr());
        lottoResult.showLottoResult();
    }

}
