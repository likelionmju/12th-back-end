public class Profit {
    public static int lottoprofit;

    public static void generateprofit(){
        int pureprofit = Main.count*1000;

        for (int i = 0; i < Main.count; i++){
            if(Result.lottograde[i] == 1){
                pureprofit = pureprofit - 2000000000;
            }else if(Result.lottograde[i] == 2){
                pureprofit = pureprofit - 30000000;
            }else if(Result.lottograde[i] == 3){
                pureprofit = pureprofit - 1500000;
            }else if(Result.lottograde[i] == 4){
                pureprofit = pureprofit - 50000;
            }else if(Result.lottograde[i] == 5){
                pureprofit = pureprofit - 5000;
            }
        }

        double a = (double) pureprofit / ((double) Main.count*1000);
        String formattedResult = String.format("%.4f", a);
        lottoprofit = (int) (a * 100);
    }
}