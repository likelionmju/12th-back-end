package lotto;

public class LottoGenerator {
    private PlayerLotto[] generatedLottoArr;

    public LottoGenerator(int generatedAmount) {
        this.generatedLottoArr = generatePlayerLotto(generatedAmount);
    }

    // n개의 로또 발행
    private PlayerLotto[] generatePlayerLotto(int generatedAmount) {
        int numberOfLotto = generatedAmount / 1000;             // 몇개 발행할지
        PlayerLotto[] generatedLottoArr = new PlayerLotto[numberOfLotto];
        for (int i = 0; i < generatedLottoArr.length; i++)
            generatedLottoArr[i] = new PlayerLotto();

        System.out.println(numberOfLotto + "개의 로또가 발행되었습니다.");
        return generatedLottoArr;
    }

    // 발행한 로또 번호 나열
    public void showGeneratedLottoNum() {
        for (PlayerLotto playerLotto : generatedLottoArr) {
            playerLotto.showLottoNumbers();
        }
        System.out.println();
    }

    public PlayerLotto[] getGeneratedLottoArr() {
        return generatedLottoArr;
    }
}
