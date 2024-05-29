import java.io.FileNotFoundException;

public class Main {
    private Result buyer;

    public Main() throws FileNotFoundException {
        buyer = new Result();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Main main = new Main();
        main.start();
    }

    private void start() {
        buyer.start();
    }
}
