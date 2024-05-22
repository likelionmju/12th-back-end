package lotto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class WinningLotto extends Lotto {
    private static final String fileName = "lotto.txt";
    private int bonusNumber;

    public WinningLotto() {
        try {
            readWinningNumbers();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (NumberFormatException e) {
            System.out.println("당첨 번호는 숫자여야 합니다.");
        }
    }

    // txt 파일에서 당첨 번호 읽어오기
    private void readWinningNumbers() throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String winNum = sc.nextLine();
            String[] winNumArr = winNum.split(" ");
            for (int i = 0; i < winNumArr.length - 1; i++) {
                lottoNumbers[i] = Integer.parseInt(winNumArr[i]);
            }
            Arrays.sort(lottoNumbers);
            bonusNumber = Integer.parseInt(winNumArr[winNumArr.length - 1]);
        }
    }
    public int getBonusNumber() {
        return bonusNumber;
    }

    // 당첨 번호 나열
    public void showLottoNumbers() {
        StringBuilder winningNumbers = new StringBuilder();
        for (int num : lottoNumbers)
            winningNumbers.append(num).append(" ");
        winningNumbers.append("+ ").append(bonusNumber);

        System.out.println("당첨 번호: " + winningNumbers);
    }
}
