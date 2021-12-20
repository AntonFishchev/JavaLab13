package lab13;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component ("cart")
public class Cart implements ICart{
    private List<IProduct> productList = new ArrayList<>();

    public void add (IProduct product) {
        productList.add(product);
    }

    public List<IProduct> getProductList () {
        return productList;
    }
}
