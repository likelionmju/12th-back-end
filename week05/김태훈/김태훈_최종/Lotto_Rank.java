public class Lotto_Rank {
    static int win1 = 0; static int win2 = 0; static int win3 = 0; static int win4 = 0; static int win5 = 0;

    public static int win_money(int win_num_cnt, int bonus_win_num) {
        int reward_1th = 2000000000; int reward_2nd = 30000000; int reward_3rd = 1500000; int reward_4th = 50000; int reward_5th = 5000;
        int win_money = 0;
        //--------------------등수 체크--------------------
        if(win_num_cnt == 6){   //1등일 때
            win1++;
            win_money += reward_1th;
        }else if(win_num_cnt==5 && bonus_win_num==1){   //2등일 때
            win2++;
            win_money += reward_2nd;
        }else if(win_num_cnt==5){   //3등일 때
            win3++;
            win_money += reward_3rd;
        }else if(win_num_cnt==4){   //4등일 때
            win4++;
            win_money += reward_4th;
        }else if(win_num_cnt==3){   //5등일 때
            win5++;
            win_money += reward_5th;
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
