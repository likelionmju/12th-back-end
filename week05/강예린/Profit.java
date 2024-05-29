package LottoProject;

public class Profit {
    private double ratio;
    // 수익률을 계산하려면 돈을 지불해야하고 당첨자의 총 수령액이 필요함
    public Profit(Purchase p, Matching m) {
        calRatio(p,m);
        printProfit();
    }
    // 수익률 계산
    private void calRatio(Purchase p, Matching m){
        if(p.getPayment()==0) ratio=0; // 수익이없으면 0
        else ratio= (p.getPayment()-m.getTotal())/(double)p.getPayment()*100;
    }
    private void printProfit(){
        System.out.println("수익률은 "+getRatio()+"%");
    }
    public double getRatio() {
        return ratio;
    }
}
