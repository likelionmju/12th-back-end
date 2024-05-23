package week05lotto;

public class Casher {
    private int money = 0;
    public static final int lottoprice = 1000;
    public void pay(int i) {
        if (money% lottoprice != 0){
            System.out.println("천 원짜리만 받습니다.");
        }
        else money = i;
    }
    public int pay() {return money;}
    //살 수 있는 로또 몇 장??
    public int ticket() {return money / lottoprice;}
    public void numberOfticket(){
        System.out.printf(ticket()+"장을 구매했습니다.");
    }
}
