package week05lotto;

public class Counter {
    private int[] counts;

    public Counter() {
        counts = new int[Prize.values().length];
    }

    public void increment(Prize prize) {
        counts[prize.ordinal()]++;
        //count는 0~5까지 있는 배열
        //match 한만큼 count 해당 배열 자리에 ++
    }

    public int getCount(Prize prize) {
        return counts[prize.ordinal()];
    }
}
