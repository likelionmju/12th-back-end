
import java.util.Scanner;
public class leejiwoo_10818 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		int[] arrnum =new int[cnt];
		for(int i=0;i<cnt;i++) {
			arrnum[i] = scanner.nextInt();
		}
		int min = arrnum[0];
		int max = arrnum[0];
		for(int i=1;i<cnt;i++) {
			
			if(arrnum[i]>max) {
				max = arrnum[i];
			}
			else if(arrnum[i]<min){
				min = arrnum[i];
			}
		}
		System.out.print(min+" "+max);
		scanner.close();
	}
//성공
}
