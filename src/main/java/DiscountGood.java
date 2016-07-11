import java.util.HashMap;
import java.util.Map;

public class DiscountGood {
    private static final Map<Good, Double> discountgoods = new HashMap<Good, Double>();

    static {
        discountgoods.put(Good.Coocla, 0.95);
    }

    public static double getDiscountGood(Good good) {
        return discountgoods.get(good);
    }
}
