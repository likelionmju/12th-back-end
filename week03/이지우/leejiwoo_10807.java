
import java.util.Scanner;
public class leejiwoo_10807 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array =new int[n];
		int cnt = 0;
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int v = scanner.nextInt();
		for(int i=0;i<n;i++) {
			if(array[i]==v) {
				cnt++;
			}
		}
		System.out.println(cnt);
		scanner.close();
		
	}
//성공
}
