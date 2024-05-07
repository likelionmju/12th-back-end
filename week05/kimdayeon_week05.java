package likelionjava.quaze;

import java.util.Arrays;

class randomLottoApp {
    private static void lottoNumber(){
        int[] lotto = new int[7];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;
            // 중복번호 제거
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        int[] bonusNumeber = {lotto[lotto.length-1]};
        int[] copyOflotto = Arrays.copyOf(lotto, lotto.length-1);
        // 오름차순 정렬
        Arrays.sort(copyOflotto);
    }

    public static void getLottoNumber(){
        System.out.println(copyOflotto);
    }

    public static void main(String[] args) {
        randomLottoApp r = new randomLottoApp();

        // 랜덤번호 출력
        System.out.println("로또번호 : " + Arrays.toString(copyOflotto()));
    }
}


public class kimdayeon_week05 {
    public static void main(String[] args) {

    }
}
