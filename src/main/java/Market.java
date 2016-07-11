import java.util.Map;

public class Market {
    private final Cart cart;
    private final Map<Good, Integer> goods;

    public Market(Cart cart) {
        this.cart = cart;
        this.goods = cart.getGoods();
    }

    public double reduce() {
        return this.cart.account() - discount();
    }

    public double discount() {
        double result = 0.0;
        for(Good good: this.goods.keySet()){
            result += good.getPrice() * this.goods.get(good) * (1-DiscountGood.getDiscountGood(good));
        }
        return result;
    }
}
