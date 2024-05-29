import java.util.Scanner;

public class LottoCasher {
    public LottoCasher() {
    }
    public int getMoney() {
        int price=0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("금액을 입력해주세요: ");
            price = sc.nextInt();
        } while (price % 1000 != 0 || price <= 0) ;
        int numOfLotto = price/1000;
        return numOfLotto;
    }
}
