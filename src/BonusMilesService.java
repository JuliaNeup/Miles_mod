public class BonusMilesService {
    int costmile = 20;

    public int calculate(int pr) {
        return (int) Math.floor(pr / costmile);
    }
}
