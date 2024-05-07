public class Profit {
    public static int lottoprofit;

    public static void generateprofit(){
        int pureprofit = Main.count*1000;

        int grade1 = 2000000000;
        int grade2 = 30000000;
        int grade3 = 1500000;
        int grade4 = 50000;
        int grade5 = 5000;

        for (int i = 0; i < Main.count; i++){
            switch (Result.lottograde[i]) {
                case 1:
                    pureprofit -= grade1;
                    break;
                case 2:
                    pureprofit -= grade2;
                    break;
                case 3:
                    pureprofit -= grade3;
                    break;
                case 4:
                    pureprofit -= grade4;
                    break;
                case 5:
                    pureprofit -= grade5;
                    break;
            }
        }

        double a = (double) pureprofit / ((double) Main.count*1000);
        String formattedResult = String.format("%.4f", a);
        lottoprofit = (int) (a * 100);
    }
}