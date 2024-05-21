package week05lotto;

public class Casher {
    public static int money = 0;
    public static void pay(int i) {
        if (money%1000 != 0){
            System.out.println("천 원짜리만 받습니다.");
        }
        else money = i;
    }
    public static int pay() {return money;}
    //살 수 있는 로또 몇 장??
    public static int ticket() {return pay() / 1000;}
    public static void numberOfticket(){
        System.out.printf(ticket()+"장을 구매했습니다.");
    }
}
