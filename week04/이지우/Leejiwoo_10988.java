import java.util.Scanner;
public class Leejiwoo_10988 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean isPalindrome = true;

        int length = word.length();
        for (int i=0;i<length/2;i++) { // 일단 반만 비교
            if (word.charAt(i) != word.charAt(length-1-i)) { //문자열의 처음과 끝부터 비교
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        scanner.close();
	}//pass
}
