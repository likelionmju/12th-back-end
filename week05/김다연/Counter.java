package week05lotto;

public class Counter {
    private int[] counts;

    public Counter() {
        counts = new int[Prize.values().length];
    }

    public void increment(Prize prize) {
        counts[prize.ordinal()]++;
    }

    public int getCount(Prize prize) {
        return counts[prize.ordinal()];
    }
}
