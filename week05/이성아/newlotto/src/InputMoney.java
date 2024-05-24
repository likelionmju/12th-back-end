import java.util.Scanner;

public class InputMoney {
    Scanner sc = new Scanner(System.in);
    public int getMoney() {
        int money;
        while (true) {
            System.out.println(">> 로또는 개당 1000원입니다. 구매할 로또 금액을 입력하시오.");
            money = sc.nextInt();
            if (money % 1000 == 0) {
                break;
            } else {
                System.out.println(">> 로또는 1000원 단위로 구매가 가능합니다. 구매할 로또 금액을 다시 입력해주세요.");
            }
        }
        return money;
    }
}
