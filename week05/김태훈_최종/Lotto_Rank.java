public class Lotto_Rank {
    static int win1 = 0;
    static int win2 = 0;
    static int win3 = 0;
    static int win4 = 0;
    static int win5 = 0;
    public static int win_money(int win_num_cnt, int bonus_win_num) {
        int win_money = 0;
        //--------------------등수 체크--------------------
        if(win_num_cnt == 6){
            win1++;
            win_money += 2000000000;
        }else if(win_num_cnt==5 && bonus_win_num==1){
            win2++;
            win_money += 30000000;
        }else if(win_num_cnt==5){
            win3++;
            win_money += 1500000;
        }else if(win_num_cnt==4){
            win4++;
            win_money += 50000;
        }else if(win_num_cnt==3){
            win5++;
            win_money += 5000;
        }
        return win_money;
    }

    public static void Print_Rank() {
        System.out.println("1등: " + win1 + "명");
        System.out.println("2등: " + win2 + "명");
        System.out.println("3등: " + win3 + "명");
        System.out.println("4등: " + win4 + "명");
        System.out.println("5등: " + win5 + "명");
    }


}
