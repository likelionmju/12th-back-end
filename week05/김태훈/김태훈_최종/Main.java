public class Main {
    public static void main(String[] args) {
        int win_money = 0;
        Lotto_Raffle lotto_raffle = new Lotto_Raffle();

        int Lotto_C = Lotto.LottoInput(); //로또 입력받고, 변수에 로또 개수 입력 받기
        WinningLotto.winninglotto(); //파일 스캔해 당첨번호 추출
        win_money = lotto_raffle.Lotto_Raffle(Lotto_C);//로또 발행
        Rate.rate(Lotto_C, win_money); //수익률 계산 후 출력
    }
}