package likelionjava.week05;
import java.util.ArrayList;
import java.util.Scanner;
public class Lotto {
    public static String lottonumber, bonusnumber;
    public static ArrayList<ArrayList<Integer>> myLottos;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("금액을 지불하세요.(1000원 단위)");
        LottoShop.pay(sc.nextInt());
        System.out.printf(LottoShop.buyed()+"장을 구매했습니다.");
        LottoShop.buyingLotto();

        System.out.println("\n**당첨 번호**");

        RandomLotto.lottoNumber();
        lottonumber = RandomLotto.getLotto();
        bonusnumber = RandomLotto.getBonus();

        LottoShop.lottoPrize();

//        sc.close();

    }
}

