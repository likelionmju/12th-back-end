import java.util.Scanner;

class seongwon_2884{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(m>45) {
            m=m-45;
        }else if(m<45) {
            if(n==0) {
                n=23;
                m=60+m-45;
            }else {
                m=60+m-45;
                n=n-1;
            }
        }else {m=0; }
        System.out.println(n+" "+m);
    }
}