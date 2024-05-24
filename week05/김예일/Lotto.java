package lotto;

public abstract class Lotto {
    protected int[] lottoNumbers;
    public Lotto() {
        this.lottoNumbers = new int[6];
    }

    public int[] getLottoNumber(){
        return lottoNumbers;
    }
    abstract public void showLottoNumbers();
}
