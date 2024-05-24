package LottoProject;

import java.util.List;

public class Matching {
    // 1등 2등 3등 4등 5등이 몇개 당첨되었는지 reward 배열에 저장
    private int[] reward = {0,0,0,0,0};

    // 등수별 보상액
    int [] price= { 2000000000, 30000000,1500000, 50000, 5000};
    //총 상금
    private int total=0;
    // 생성자 실행하면 바로 fileread 객체 만들어서 당첨번호와 보너스 번호를 읽어오고 만들어 놓은 로또들 필요
    public Matching(Lottos ls){
        FileRead fr= new FileRead();
        matchedNum(ls, fr);
        printPrice(fr);
    }

    public int[] getPrice() {
        return price;
    }

    public int getTotal() {
        return total;
    }

    // 6번째 숫자까지 확인 후 5개 맞으면 마지막 보너스 넘버도 확인- for each문 사용
    private void matchedNum(Lottos ls, FileRead fr) {
        for(Lotto l : ls.getLottos()){
            int cnt=0;
            for(int n: fr.getAnsnum()){
                if(l.getLotto().contains(n)) cnt++; // contains 사용하여 당첨번호가 포함 되어있으면 cnt++
            }
            // 한장 확인이 끝나면 기존 번호랑 몇개가 같은지와 보너스 번호가 맞는지 확인함
            switch (cnt){
                case 6:
                    reward[0]++;
                    break;
                case 5:
                    if(l.getBonusNum()==fr.getBnum()) reward[1]++;
                    else reward[2]++;
                    break;
                case 4:
                    reward[3]++;
                    break;
                case 3:
                    reward[4]++;
                    break;
            }
        }

        calTotal();
        }
        // 상금 총 합 계산하기
    private void calTotal(){
        for (int i=0 ; i< price.length; i++) {
            total += price[i]* reward[i];
        }
    }
    // 당첨번호랑 결과
    private void printPrice(FileRead fr){
        System.out.print("당첨 번호는: ");
        for (int i=0; i<fr.getAnsnum().length; i++) System.out.print(fr.getAnsnum()[i]+" ");
        System.out.println("+"+fr.getBnum());
        for (int i=0; i<reward.length; i++){
            System.out.println((i+1)+"등 ("+getPrice()[i]+"): "+reward[i]+"개");
            total+= price[i]*reward[i];
        }
        System.out.println("총 "+getTotal()+"원 입니다.");
    }
}
