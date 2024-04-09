package 백준;
import java.util.Scanner;
public class q2884 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        if(min>45){
            System.out.print(hour+" ");
            System.out.print(min-45);
        }
        else if(hour==23 && min<45){
                System.out.print(hour-1+" ");
                System.out.print(60-(45-min));
            }
        else if(min<45){
            System.out.print(hour-1+24+" ");
            System.out.print(60-(45-min));
            
        }
        scanner.close();
	}

}
