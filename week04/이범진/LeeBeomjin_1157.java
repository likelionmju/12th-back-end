package Week04;

import java.util.Scanner;

public class LeeBeomjin_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase(); // 대소문자 구분 없기 때문에 들어오는 단어를 그냥 다 소문자로

        int[] count = new int[26]; // 알파벳의 위치를 넣어줄 배열
        char[] split = word.toCharArray(); // 받은 단어를 한글자씩 배열로


        for(int i=0;i<split.length;i++){
            int index = split[i]-'a';  // 소문자의 알파벳 인덱스 계산
         count[index]++; // 26개의 알파벳 배열중 해당 위치에 값 1 추가 => 등장할때마다 +1
        }
        int max = 0; // 최대 수 담기위한 변수
        int indexM =0; // 최대수 찾아내기 위한 변수. 0부터 시작
        for(int i=0;i< count.length;i++){
            if(count[i]>max){ // max보다 크면 max값 갱신, 해당 max값의 index
                max=count[i];
                indexM=i;
            }
        }

        int isOver2 = 0; // 동일한 max가 두 번 나왔을 때 카운트할 변수
        for(int i=0;i< count.length;i++){
            if(count[i] == max){
                isOver2 = isOver2+1; // 두 번 이상 나왔을 때, +1 해준다.
            }
            if(isOver2 >=2){ // 만약 두 번 이상이면 ? 출력 후 종료.
                System.out.println("?");
                break;
            }


        }
        if(isOver2<2){ // 두 번 이하이면 (동일한 값 존재 X)
            char maxAlpha = (char) ('A'+indexM); // 앞서 구한 max값의 인덱스를 더해서 대문자 만들기
            System.out.println(maxAlpha);
        }
    }
}
