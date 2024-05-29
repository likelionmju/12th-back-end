public class Rate {
    public static void rate(int Lotto_C, int win_money) {
        int total_M = Lotto_C*1000; //총 금액
        int profit = win_money - total_M; //순이익
        float rate = ((float)profit/total_M)*100; //수익률 계산

        System.out.println("수익률: " + String.format("%.2f", rate) + "%"); //계산한 수익률 출력
    }
}
