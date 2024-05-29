import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to purchase lotto tickets (in multiples of 1000):");
        int totalAmount = scanner.nextInt();

        while (totalAmount % 1000 != 0) {
            System.out.println("Invalid amount. Please enter a multiple of 1000.");
            totalAmount = scanner.nextInt();
        }

        LottoMachine machine = new LottoMachine();
        List<LottoTicket> tickets = machine.purchaseTickets(totalAmount);
        tickets.forEach(ticket -> System.out.println("Generated Ticket: " + Arrays.toString(ticket.getNumbers())));

        // 파일에서 당첨 번호 읽기
        List<Integer> allNumbers = FileInput.readWinningNumbers("C:\\study\\javaBasic\\src\\winning_nums.txt");
        List<Integer> winningNumbers = allNumbers.subList(0, 6);  // 주 당첨 번호 6개
        int bonusNumber = allNumbers.get(6);  // 보너스 번호

        System.out.println("Winning numbers: " + winningNumbers + " + Bonus: " + bonusNumber);

        LottoResultsProcessor processor = new LottoResultsProcessor();
        processor.checkResults(tickets, winningNumbers, bonusNumber);
    }
}
