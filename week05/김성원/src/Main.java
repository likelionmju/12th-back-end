import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int count;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("구매할 금액 입력 : ");
        int money = sc.nextInt();
        if (money % 1000 != 0) {
            System.out.println("1000원 단위로 입력해주세요");
        } else {
            count = money / 1000;
            System.out.println(count + "장의 로또를 구매하셨습니다.");

            NumberMake.generateLottoNumbers();
            AnswerToArray.answearray();
            Result.lottoresult();
            Profit.generateprofit();

            System.out.print("이번주 로또 번호 : ");
            System.out.println(Arrays.toString(AnswerToArray.answer)); //로또 정답

            for (int i = 0; i < Main.count; i++){
                System.out.print(i+1);
                System.out.print("번 로또 : ");
                System.out.print(Arrays.toString(NumberMake.lotto[i]));//구매한 로또
                if (Result.lottograde[i] == 6){
                    System.out.println("꽝");
                }else {
                    System.out.print(Result.lottograde[i]);//로또 등수
                    System.out.println("등");
                }

            }
            System.out.print("수익률 : ");
            System.out.print(Profit.lottoprofit);
            System.out.println("%");
        }
    }
}
