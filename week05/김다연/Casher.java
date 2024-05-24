package week05lotto;

import java.util.Scanner;

public class Casher {
    private int money = 0;
    public static final int lottoprice = 1000;
    public Casher(){
        pay();
        numberOfticket();
    }
    public void pay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 지불하세요.(1000원 단위)");
        money = sc.nextInt();
        if (money % lottoprice == 0) {
            return;
        } else{
            System.out.println("천 원짜리만 받습니다.");
            pay();
        }
    }
    public int getMoney() {return money;}
    //살 수 있는 로또 몇 장??
    public int ticket() {return money / lottoprice;}
    public void numberOfticket(){
        System.out.printf(ticket()+"장을 구매했습니다.");
    }
}
