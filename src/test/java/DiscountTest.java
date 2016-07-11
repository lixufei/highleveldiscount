import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountTest {

    @Test
    public void should_return_3_when_buy_1_colcate() throws Exception {
        Cart cart = new Cart();
        cart.addToCart(Good.Coocla, 1);
        assertEquals(3.0, cart.account(), 0.001);
    }

    @Test
    public void should_return_9_when_buy_3_colcate() throws Exception {
        Cart cart = new Cart();
        cart.addToCart(Good.Coocla, 3);
        assertEquals(9.0, cart.account(), 0.001);
    }

    @Test
    public void should_return_0_15_when_buy_1_colcate_get_discount() throws Exception {
        Cart cart = new Cart();
        cart.addToCart(Good.Coocla, 1);
        Market market = new Market(cart);
        assertEquals(0.15, market.discount(), 0.001);
    }

    @Test
    public void should_return_0_45_when_buy_3_colcate_get_discount() throws Exception {
        Cart cart = new Cart();
        cart.addToCart(Good.Coocla, 3);
        Market market = new Market(cart);
        assertEquals(0.45, market.discount(), 0.001);
    }

    @Test
    public void should_return_0_15_when_buy_1_colcate_after_discount() throws Exception {
        Cart cart = new Cart();
        cart.addToCart(Good.Coocla, 1);
        Market market = new Market(cart);
        assertEquals(2.85, market.reduce(), 0.001);
    }

    @Test
    public void should_return_0_45_when_buy_3_colcate_after_discount() throws Exception {
        Cart cart = new Cart();
        cart.addToCart(Good.Coocla, 3);
        Market market = new Market(cart);
        assertEquals(8.55, market.reduce(), 0.001);
    }
}
