package lotto;

public enum WinningPrize {

    firstPrize(1, 200000000),
    secondPrize(2, 30000000),
    thirdPrize(3, 1500000),
    fourthPrize(4, 50000),
    fifthPrize(5, 5000),
    lose(6, 0);

    private int rank;
    private int prize;
    WinningPrize(int rank, int prize) {
        this.rank = rank;
        this.prize = prize;
    }
    public int getRank() {
        return rank;
    }

    public int getPrize() {
        return prize;
    }
}

