package 백준;
import java.util.Scanner;
public class q2588 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = num2/100; //백의자리
		int num4 = (num2/10)%10; //십의자리
		int num5 = num2%10; //일의자리
		int num6 = num1*num5;
		int num7 = num1*num4*10;
		int num8 = num1*num3*100;
		System.out.println(num6);
		System.out.println(num7/10);
		System.out.println(num8/100);
		System.out.println(num6+num7+num8);
		scanner.close();
		//성공
	}

}
