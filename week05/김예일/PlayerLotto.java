package lotto;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayerLotto extends Lotto {
    public PlayerLotto() {
        drawNumbers();
    }

    // 로또 번호 추첨
    private void drawNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (numbers.size() != lottoNumbers.length) {
            int n = (int) (Math.random() * 45) + 1;
            if (!numbers.contains(n))
                numbers.add(n);
        }
        for (int i = 0; i < lottoNumbers.length; i++)
            lottoNumbers[i] = numbers.get(i);

        Arrays.sort(lottoNumbers);
    }

    // 추첨 번호 나열
    public void showLottoNumbers(){
        StringBuilder lottoNumber = new StringBuilder();
        for (int num : lottoNumbers)
            lottoNumber.append(num).append(" ");

        System.out.println(lottoNumber);
    }
}
