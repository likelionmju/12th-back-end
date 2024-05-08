public class Main {
    private LottoShop lottoShop;

    public Main(){
        lottoShop = new LottoShop();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start() {
        lottoShop.start();
    }
}