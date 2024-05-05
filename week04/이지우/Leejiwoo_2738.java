import java.util.Scanner;

public class Leejiwoo_2738 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     int num1 = scanner.nextInt();
	     int num2 = scanner.nextInt();
	     int[][] a = new int[num1][num2];
	     int[][] b = new int[num1][num2];
	     int[][] c = new int[num1][num2];
	     for (int i=0; i<num1;i++) {
	         for (int j=0;j< num2;j++) {
	        	 a[i][j] = scanner.nextInt();
	         }
	     }
	     for (int i=0;i<num1;i++) {
	         for (int j=0;j<num2;j++) {
	             b[i][j] = scanner.nextInt();
	         }
	     }
	     for (int i=0;i<num1;i++) {
             for (int j=0;j<num2;j++) {
        	     c[i][j] = a[i][j] + b[i][j];
	         }
	     }
	     for (int i=0;i<num1;i++) {
	         for (int j=0;j<num2;j++) {
	             System.out.print(c[i][j] + " ");
	         }
	            System.out.println();
	     }
	        scanner.close();
	}
	//성공
}
