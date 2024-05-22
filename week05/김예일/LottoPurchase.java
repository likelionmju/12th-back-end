package lotto;

import java.util.Scanner;

public class LottoPurchase {
    private int amount;

    public LottoPurchase(){
        this.amount = buyLotto();
    }

    public int getAmount() {
        return amount;
    }

    // 로또 구매 금액 입력
    private int buyLotto() {
        System.out.println("구매 금액을 입력해 주세요.");
        Scanner sc = new Scanner(System.in);

        int amount = 0;
        while (amount == 0) {
            amount = validateAmount(sc.next());
        }
        return amount;
    }

    // 구매 금액 검증
    private int validateAmount(String input) {
        try {
            int amount = Integer.parseInt(input);
            if (amount < 1000) {
                System.out.println("1000원 이상으로 입력해 주세요.");
                return 0;
            }
            if (amount % 1000 != 0) {
                System.out.println("1000원 단위로 입력해 주세요.");
                return 0;
            }
            return amount;
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해 주세요.");
            return 0;
        }
    }
}
