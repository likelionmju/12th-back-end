import java.util.Scanner;
public class Leejiwoo_1152 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine().trim();
		if(sentence.isEmpty()) {
			System.out.println('0');
		}
		else
			System.out.println(sentence.split(" ").length);
		scanner.close();
	}
//pass
}
