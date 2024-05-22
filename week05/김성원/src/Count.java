import java.io.FileNotFoundException;
import java.util.Scanner;

public class Count {
    public int count;

    public void generateCount() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("구매할 금액 입력 : ");
        int money = sc.nextInt();
        if (money % 1000 != 0) {
            System.out.println("1000원 단위로 입력해주세요");
        } else {
            count = money / 1000;
            System.out.println(count + "장의 로또를 구매하셨습니다.");
            NumberMake numberMake = new NumberMake(this);
            numberMake.generateLottoNumbers();
        }
    }
}
