package week05lotto;

public enum Prize {
    // 등수 ( 상금 , 안내문 )
    FIRST(2000000000, "1등: 6개 일치 (2,000,000,000원)"),
    SECOND(30000000, "2등: 5개+보너스 일치 (30,000,000원)"),
    THIRD(1500000, "3등: 5개 일치 (1,500,000원)"),
    FOURTH(50000, "4등: 4개 일치 (50,000원)"),
    FIFTH(5000, "5등: 3개 일치 (5,000원)"),
    NONE(0, "꽝");

    private final int amount;
    private final String description;

    Prize(int amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
