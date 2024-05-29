public class IncomeRate{
    public static float calculateIncomeRate(int reward, int winning) {
        float rateOfIncome = (winning-reward/reward) * 100;
        return Math.round(rateOfIncome*100) / 100;
    }
}