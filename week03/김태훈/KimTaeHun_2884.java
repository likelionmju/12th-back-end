import java.util.Scanner;
public class KimTaeHun_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(1<=H && H<=24 && 45<=M && M<=60){
            M = M -45;
            System.out.print(H + " " + M);
        } else if(1<=H && H<=24 && M<45){
            H --;
            M = M + 15;
            System.out.print(H + " " + M);
        } else if(H==0 && M<45){
            H = 23;
            M = M + 15;
            System.out.print(H + " " + M);
        } else if(H==0 && 45<=M && M<=60){
            M = M -45;
            System.out.print(H + " " + M);
        }
    }
}