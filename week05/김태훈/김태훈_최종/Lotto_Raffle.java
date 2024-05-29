import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lotto_Raffle extends Main{ //로또 발행하는 클래스
    private static int Lotto_C; // Main 클래스의 Lotto_C 변수를 대체하는 변수
    int win_num_cnt = 0;
    int bonus_win_num = 0;
    int win_money = 0;

    public Lotto_Raffle() {}
    public Lotto_Raffle(int lotto_C) {
        super();
    }

    public int Lotto_Raffle(int Lotto_C) {
        Lotto_Raffle.Lotto_C = Lotto_C; //Main 클래스의 Lotto_C 변수 가져오기
        int[] win_number = WinningLotto.getWinnum(); //당첨 번호 가져오기
        int bonusnum = WinningLotto.getBonusnum(); //보너스 번호 가져오기

        for(int i=0; i<Lotto_C; i++) { //만들어져야하는 로또만큼 반복
            ArrayList<Integer> numbers = new ArrayList<Integer>(); //arraylist 선언

            while (numbers.size() < 6) { // 로또 숫자 6개가 될 때까지 반복
                int RN = Random_Setting.Random_N(); //RN에 랜덤 수 받기

                if (!numbers.contains(RN)) { //중복되는 숫자 걸러주기
                    numbers.add(RN);
                }
            }

            Collections.sort(numbers); //로또번호 오름차순 정리

            for (int num : numbers) { //생성된 로또 번호 출력
                System.out.print(num + " ");
            }
//            ArrayList<Integer> numbers = new ArrayList<Integer>();
//            numbers.add(1);numbers.add(11);numbers.add(20);numbers.add(23);numbers.add(32);numbers.add(34);
            System.out.print("\n");
            //당첨 확인
            for (int num : numbers) { //당첨 확인
                for (int k = 0; k < 6; k++) { //당첨 번호 겹치는 개수 확인
                    if (win_number[k] == num) {
                        win_num_cnt++;
                    }
                }
                if (num == bonusnum) { //보너스 번호 겹치는지 확인
                    bonus_win_num++;
                }
            }
            win_money = win_money + Lotto_Rank.win_money(win_num_cnt, bonus_win_num); //당첨금 총액 계산
            //등수 확인 변수들 초기화
            win_num_cnt = 0;
            bonus_win_num = 0;
        }
        Lotto_Rank.Print_Rank();//등수 계산

        System.out.println("총 로또 개수: " + Lotto_C + "개"); //로또 개수 확인
        return win_money;
    }



}
