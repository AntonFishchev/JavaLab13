package lab13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("orderService")
public class OrderService {
    private ICart cart;

    public OrderService(ICart cart) {
        this.cart = cart;
    }

    public void order() {
        Integer sum = 0;
        for (IProduct product : cart.getProductList()) {
            System.out.println(product);
            sum += product.getCost();
        }
        System.out.println("Итоговая сумма - " + sum);
    };

    public void setCart(ICart cart) {
        this.cart = cart;
    }
}
