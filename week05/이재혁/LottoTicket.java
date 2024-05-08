import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class LottoTicket {
    private int[] numbers;

    public LottoTicket() {
        this.numbers = generateNumbers();
    }

    private int[] generateNumbers() {
//        Random random = new Random();
//        Set<Integer> generated = new HashSet<>();
//        while (generated.size() < 6) {
//            int next = random.nextInt(45) + 1;  // 1부터 45까지의 번호 생성
//            generated.add(next);
//        }
//        int[] nums = generated.stream().mapToInt(Integer::intValue).toArray();
//        Arrays.sort(nums);
//        return nums;
        return new int[]{2, 9, 13, 22, 41, 42};  // 보너스 번호를 제외한 6개의 기본 당첨 번호

    }

    public int[] getNumbers() {
        return numbers;
    }
}
