package week05lotto;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public ArrayList<Integer> readNumbersFromFile(String filePath) {
        ArrayList<Integer> WinningNumbers = new ArrayList<>();

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                WinningNumbers.add(number);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }

        return WinningNumbers;
    }
//**파일 잘 받아왔는지 확인
//    public static void main(String[] args) {
//        ArrayList<Integer> WinningNumbers = readNumbersFromFile("C:\\Users\\dayx7\\IdeaProjects\\untitled1\\src\\week05lotto\\input.txt");
//
//        if (WinningNumbers.size() < 7) {
//            System.out.println("파일에 적절한 수의 숫자가 없습니다. 7개의 숫자가 필요합니다.");
//            return;
//        }
//
//        // 6개의 당첨 번호와 1개의 보너스 번호로 분리
//        ArrayList<Integer> winningNumbers = new ArrayList<>(WinningNumbers.subList(0, 6));
//        int bonusNumber = WinningNumbers.get(6);
//
//        System.out.println("당첨 번호: " + winningNumbers);
//        System.out.println("보너스 번호: " + bonusNumber);
//    }
}
