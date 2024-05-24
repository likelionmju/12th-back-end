package week05lotto;

import java.util.ArrayList;

public class Main {
    private ArrayList<Integer> winningNumbers;
    private int bonusNumber;
    public ArrayList<Integer> getWinningNumbers() {
        return winningNumbers;
    }
    public int getBonusNumber() {
        return bonusNumber;
    }
    public Main(){
        FileReader fileReader = new FileReader();

        this.winningNumbers= fileReader.getWinningNumbers();
        this.bonusNumber= fileReader.getBonusNumber();

        Evaluator evaluator = new Evaluator(getWinningNumbers(), getBonusNumber());
        showWinningNumbers();
    }
    public void showWinningNumbers(){
        System.out.println("당첨 번호: " + this.winningNumbers);
        System.out.println("보너스 번호: " + this.bonusNumber);

    }


    public static void main(String[] args) {
        Main m = new Main();
        return;
        //리턴 안 하면 영원히 실행 됨
    }
}






