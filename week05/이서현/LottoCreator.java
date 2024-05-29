import java.security.SecureRandom;

public class LottoCreator {
    private SecureRandom secureRandom;
    private Lottos lottos;
    final int maxNum = 46;
    final int minNum = 1;
    public LottoCreator(){
        this.secureRandom = new SecureRandom();
        this.lottos = new Lottos();
    }
    public Lottos create(int numOfLotto) {
        for (int i = 0; i < numOfLotto; i++) {
            lottos.add(createLotto());
        }
        return this.lottos;
    }
    private Lotto createLotto(){
        Lotto lotto = new Lotto();
        for (int i = 0; i < 6; i++) {
            int randomNum = secureRandom.nextInt(maxNum - minNum) + minNum;
            lotto.add(randomNum);
        }
        return lotto;
    }
}
