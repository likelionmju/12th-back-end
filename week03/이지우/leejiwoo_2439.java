import java.util.Scanner;
public class leejiwoo_2439 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
			for(int k=1;k<=num;k++) {
				for(int i=num-k;i>=1;i--) {
					System.out.print(" ");
				}
				for(int j=1;j<=k;j++) {
					System.out.print("*");
				}	
				System.out.println("");
			}
		scanner.close();
	}
//성공
}
