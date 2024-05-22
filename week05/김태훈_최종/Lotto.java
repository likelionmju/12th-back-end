import java.util.Scanner;

public class Lotto {
    public static int LottoInput(){
        Scanner sc = new Scanner(System.in);
        int total_M = 0; //받은 총 금액
        int Lotto_C = 0; //로또 개수
        boolean Check_total_M = false; //1000원 단위일 때를 구분하기 위한 변수

        while (!Check_total_M) { //1000원 단위임을 확인하는 while문
            System.out.print("로또 구매 금액을 입력해주세요: ");
            try{
                total_M = sc.nextInt(); // 금액 입력받기
                if (total_M % 1000 != 0) { // 로또 금액 1000원 단위로만 받기
                    System.out.println("로또는 1000원 단위로만 구매 가능합니다.");
                } else {
                    Check_total_M = true; //1000원 단위이면 while문 나오기
                }
            }catch (NumberFormatException e){ //숫자 외의 입력 거르고 다시 시작
                System.out.println("숫자만 입력해 주세요.");
            }

        }
        Lotto_C = total_M / 1000; //총 로또 개수 체크
        return Lotto_C;
    }
}
