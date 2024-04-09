import java.util.Scanner;

public class alert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr = new int[2]; //
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt(); // 시간이랑 분을 받고
        }

        if (arr[1] >= 45){ // 분을 45기준으로 나눔
            arr[1] -= 45; // 분이 45보다 크거나 같으면 시간은 변화 x
        }else{ // 분이 45보다 작으면
            if(arr[0]==0){ // 분이 0인 경우
                arr[0]=23; // 23으로 바꿈
                arr[1]=(arr[1]+60-45); // 그리고 분에다가 올림으로 60해주고 45빼줌
            }else{ // 분이 0이 아니면
                arr[0]-=1; // 시간에서 1시간 빼고
                arr[1]=(arr[1]+60-45); //분 60분 더하고 45 빼기
            }

        }
        System.out.println(arr[0]+" "+arr[1]);
        scanner.close();

    }
}
