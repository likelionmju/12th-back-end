package week05lotto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<ArrayList<Integer>> myLottos;
    public static ArrayList<Integer> winningNumbers;
    public static int bonusNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadFile file = new ReadFile();
        ArrayList<Integer> FileNumebrs = file.readNumbersFromFile("C:\\Users\\dayx7\\IdeaProjects\\untitled1\\src\\week05lotto\\input.txt");

        if (FileNumebrs.size() < 7) {
            System.out.println("파일에 적절한 수의 숫자가 없습니다. 7개의 숫자가 필요합니다.");
            return;
        }
        // 6개의 당첨 번호와 1개의 보너스 번호로 분리
        winningNumbers = new ArrayList<>(FileNumebrs.subList(0, 6));
        bonusNumber = FileNumebrs.get(6);

        System.out.println("당첨 번호: " + winningNumbers);
        System.out.println("보너스 번호: " + bonusNumber);


        System.out.println("금액을 지불하세요.(1000원 단위)");
        Casher.pay(sc.nextInt());
        Casher.numberOfticket();
        LottoMachine.Lotto();

        LottoMachine.lottoWin();

//        sc.close();

    }
}

