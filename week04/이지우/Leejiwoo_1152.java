import java.util.Scanner;
public class Leejiwoo_1152 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		int cnt=1;
		for(int i=0;i<sentence.length();i++) {
			char ch = sentence.charAt(i);
			int lastIndex = sentence.length() - 1;
			
			if(sentence.charAt(0)==' ' || sentence.charAt(lastIndex)==' ') {
				cnt--;
				if(ch == ' ') {
					cnt++; 
				}
				
			}
			if(ch == ' ') {
				
				cnt++;
			}
			
		}
		System.out.println(cnt);
		scanner.close();
	}

}
