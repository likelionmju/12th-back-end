import java.util.*;
public class seongwon_10817{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int search=0;

        int N= sc.nextInt();

        int[] num=new int [N];
        for(int i=0; i<N;i++){
            num[i]=sc.nextInt();
        }

        int v=sc.nextInt();

        for(int i=0;i<N;i++){
            if(num[i]==v){
                search=search+1;
            }
        }
        System.out.print(search);
    }
}