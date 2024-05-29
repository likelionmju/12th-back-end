import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LotteryFileread {
    private List<Integer> winningNumbers;
    private int bonusNumber;

    public void readFile(String filePath) throws InvalidFileFormatException, FileNotFoundException {
        List<Integer> numbers = readLotteryNumbers(filePath);
        winningNumbers = numbers.subList(0, 6);
        bonusNumber = numbers.get(6);
    }

    public List<Integer> getWinningNumbers() {
        return winningNumbers;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }

    private List<Integer> readLotteryNumbers(String filePath) throws FileNotFoundException, InvalidFileFormatException {
        List<Integer> numbers = new ArrayList<>();
        Pattern numberPattern = Pattern.compile("\\d+");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = numberPattern.matcher(line);
                while (matcher.find()) {
                    int number = Integer.parseInt(matcher.group());
                    if (number < 1 || number > 45) {
                        throw new InvalidFileFormatException("파일에 유효한 숫자가 아닌 수가 포함되어 있습니다: " + number);
                    }
                    numbers.add(number);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (numbers.size() < 7) {
            throw new InvalidFileFormatException("파일에 충분한 숫자가 포함되어 있지 않습니다.");
        }

        return numbers;
    }

    public static class InvalidFileFormatException extends Exception {
        public InvalidFileFormatException(String message) {
            super(message);
        }
    }
}
