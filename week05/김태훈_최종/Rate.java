public class Rate {
    public static void rate(int Lotto_C, int win_money) {
        int total_M = Lotto_C*1000; //총 금액
        int profit = win_money - total_M; //순이익
        float rate = ((float)profit/total_M)*100;

//        if(win_money > total_M){ //수익률이 +일 때
//            rate = ((double)profit/total_M)*100;
//        }else if(win_money==0){ //당첨이 없을 때
//            rate = -100;
//        }else{ //수익률이 -일 때
//            rate = ((double)profit/total_M)*100;
//        }
        System.out.println("수익률: " + String.format("%.2f", rate) + "%"); //계산한 수익률 출력
    }
}
