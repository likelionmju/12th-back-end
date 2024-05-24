package lotto;

public class LottoResult {
    private PlayerLotto[] generatedLottoArr;
    private int[] winningNumbers;
    private int bonusNumber;
    private int[] prizeCount;

    public LottoResult(PlayerLotto[] playerLottoArr) {
        this.generatedLottoArr = playerLottoArr;
        WinningLotto winningLotto = new WinningLotto();
        this.winningNumbers = winningLotto.getLottoNumber();
        this.bonusNumber = winningLotto.getBonusNumber();
        this.prizeCount = new int[WinningPrize.values().length];
        checkLottoResult();
    }

    // 로또 결과 출력
    public void showLottoResult() {
        for (int i = 0; i < prizeCount.length - 1; i++) {
            System.out.printf("%d등 당첨: %d개 \n", i + 1, prizeCount[i]);
        }
        calculateProfit();  // 수익률 계산 및 출력
    }

    // 로또 결과 계산
    private void checkLottoResult() {
        for (PlayerLotto generatedLotto : generatedLottoArr) {
            int[] lottoNumbers = generatedLotto.getLottoNumber();               // 추첨 번호 가져오기
            int count = countMatchedNumbers(lottoNumbers, winningNumbers);      // 당첨 번호와 몇개 일치하는지 계산
            boolean isMatchedBonus = checkMatchedBonus(lottoNumbers, bonusNumber);    // 보너스 일치 여부
            int rank = getPrize(count, isMatchedBonus);
            prizeCount[rank - 1]++;
        }

    }

    // 당첨 번호 몇개 맞았는지 계산
    private int countMatchedNumbers(int[] playerNumbers, int[] winningNumbers) {
        int matechedCount = 0;
        for (int playerNumber : playerNumbers) {
            for (int winningNumber : winningNumbers) {
                if (playerNumber == winningNumber) {
                    matechedCount++;
                    break;
                }
            }
        }
        return matechedCount;
    }

    // 보너스 번호 맞았는지 체크
    private boolean checkMatchedBonus(int[] playerNumbers, int bonusNumber) {
        for (int playerNumber : playerNumbers) {
            if (playerNumber == bonusNumber)
                return true;
        }
        return false;
    }

    // 등수 계산 후 해당 등수 인덱스 반환
    private int getPrize(int matchedCount, boolean isMatchedBonus) {
        switch (matchedCount) {
            case 6:
                return WinningPrize.firstPrize.getRank();
            case 5:
                if (isMatchedBonus) return WinningPrize.secondPrize.getRank();
                else return WinningPrize.thirdPrize.getRank();
            case 4:
                return WinningPrize.fourthPrize.getRank();
            case 3:
                return WinningPrize.fifthPrize.getRank();
            default:
                return WinningPrize.lose.getRank();
        }
    }

    // 수익률 계산
    private void calculateProfit() {
        int totalPrize = calculateTotalPrize();
        int profit = generatedLottoArr.length * 1000;
        System.out.println("총 수익금: " + profit);
        System.out.println("총 당첨금: " + totalPrize);

        double rate = ((double) (profit - totalPrize) / profit) * 100;
        System.out.printf("총 수익률: %.1f%%", rate);
    }

    // 총 당첨금 계산
    private int calculateTotalPrize() {
        WinningPrize[] winningPrizes = WinningPrize.values();
        int sum = 0;
        for (int i = 0; i<winningPrizes.length;i++) {
            sum += winningPrizes[i].getPrize() * prizeCount[i];
        }
        return sum;
    }
}
