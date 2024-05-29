import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileInput {
    public static List<Integer> readWinningNumbers(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        List<Integer> numbers = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            numbers.add(Integer.parseInt(line.trim()));
        }
        reader.close();
        return numbers;
    }
}
