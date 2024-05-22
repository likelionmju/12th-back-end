package LottoProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Purchase {
    // 지불한 돈
    private int payment;
    Scanner scn;
    public Purchase(){
        scn= new Scanner(System.in);
        buyTicket();
    }
    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getPayment() {
        return payment;
    }

    // 1000원 단위로 구매해야지만 payment에 저장
    private void buyTicket(){
        while(true){
            try {
                System.out.println("구매할 액수를 입력해주세요.");
                int n = scn.nextInt();
                if (n % 1000 == 0) {
                    setPayment(n);
                    return;
                } else {
                    System.out.println("1000원 단위로 구매해주세요.");
                }
            } catch(InputMismatchException e){
                System.out.println("숫자를 입력해주세요.");
                scn.next();
            }
        }
    }
}
