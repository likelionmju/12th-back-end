package week05lotto;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    private ArrayList<Integer> winningNumbers = new ArrayList<>(6);
    private int bonusNumber;
    private static final String filePath="C:\\Users\\dayx7\\IdeaProjects\\untitled1\\src\\week05lotto\\input.txt";
    public FileReader(){
        setWinningNumbers();
        setBonusNumber();
    }
    private ArrayList<Integer> readNumbersFromFile(String filePath) {
        ArrayList<Integer> Numbers = new ArrayList<>(6);

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                Numbers.add(number);
            }

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }
        if (Numbers.size() < 7) {
            System.out.println("파일에 7개의 정수가 필요합니다.");
        }
        //삼항연산자 써본경우
        // String text = FileNumebrs.size() < 7 ? "파일에 적절한 수의 숫자가 없습니다. 7개의 숫자가 필요합니다." : "";
        // System.out.println(text);

        return Numbers;
    }
    private int setBonusNumber() {
        this.bonusNumber = readNumbersFromFile(filePath).remove(6);
        return bonusNumber;
    }
    public int getBonusNumber(){
        return bonusNumber;
    }
    private ArrayList<Integer> setWinningNumbers(){
        this.winningNumbers = readNumbersFromFile(filePath);

        return winningNumbers;
    }
    public ArrayList<Integer> getWinningNumbers(){
        return winningNumbers;
    }

}
