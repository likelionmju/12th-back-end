public enum PRIZES {
    FIRST(2000000000), SECOND(30000000), Third(1500000), FOURTH(50000), FIFTH(5000);


    private final int value;

    PRIZES(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
