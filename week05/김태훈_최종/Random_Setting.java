import java.util.Random;

public class Random_Setting extends Lotto_Raffle{
    
    public Random_Setting(int lottoC) {
        super(lottoC);
    }

    public static int Random_N(){
        Random random = new Random();

        int random_Number = random.nextInt(45) + 1; // 1부터 45 사이의 랜덤한 수 만들기
        return random_Number; //만든 수 리턴
    }
}
