public class BonusMilesService {
    public int cost(int price) {
        int result;
        if (price > 100) {
            result = price / 100;
        } else {
            result = 0;
        }
        return result;
    }
}

