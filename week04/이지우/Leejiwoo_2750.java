import java.util.Scanner;
public class Leejiwoo_2750 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arrnum = new int[N];
		int tmp=0;
		for(int i=0;i<N;i++) {
			arrnum[i] = scanner.nextInt();
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N-i-1;j++) {
				if(arrnum[j]>arrnum[j+1]) {
					tmp = arrnum[j];
					arrnum[j] = arrnum[j+1];
					arrnum[j+1] = tmp;
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			System.out.println(arrnum[i]);
		}
		scanner.close();
		//pass
	}
}
