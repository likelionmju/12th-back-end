package likelionjava.week05;

import java.util.Arrays;

class RandomLotto {
    static int[] lotto = new int[7];

    static int[] bonus = new int[1];


    public static void lottoNumber() {

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

        bonus[0] = lotto[lotto.length - 1];
        lotto = Arrays.copyOf(lotto, lotto.length - 1);

//        // 오름차순 정렬
        Arrays.sort(lotto);
        System.out.println("로또 번호: " + Arrays.toString(lotto));
        System.out.println("보너스 번호: " + Arrays.toString(bonus));
    }

    public static String getLotto() {
        return Arrays.toString(lotto);
    }
    public static String getBonus(){
        return Arrays.toString(bonus);
    }

    public static void main(String[] args) {
        lottoNumber();
        System.out.println(getLotto());
        System.out.println(getBonus());

    }
}