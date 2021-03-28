public class BonusMilesService {
    int cost_mile = 20;
    public int calculate(int pr) {
        return (int) Math.floor(pr/cost_mile);
    }
}
