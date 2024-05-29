import java.util.Scanner;

public class LotteryInput {
    private int howMany;

    public void inputPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("구입금액을 입력해 주세요.");

        String input = sc.nextLine();
        while (!input.matches("\\d+")) {
            System.err.println("[ERROR] 잘못된 형식의 입력입니다.");
            System.out.println("구입금액을 입력해 주세요.");
            input = sc.nextLine();
        }

        int price = Integer.parseInt(input);

        while (price % 1000 != 0 || price == 0) {
            System.err.println("[ERROR] 구입금액은 1000원 단위로 입력해주세요.");
            System.out.println("구입금액을 입력해 주세요.");
            input = sc.nextLine();
            while (!input.matches("\\d+")) {
                System.err.println("[ERROR] 잘못된 형식의 입력입니다.");
                System.out.println("구입금액을 입력해 주세요.");
                input = sc.nextLine();
            }
            price = Integer.parseInt(input);
        }
        this.howMany = price / 1000;
        System.out.println();
        System.out.println(this.howMany + "개를 구매했습니다.");
    }

    public int getHowMany() {
        return howMany;
    }
}
