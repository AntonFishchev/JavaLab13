package lab13;

import java.util.List;

public interface ICart {
    public void add (IProduct product);
    public List<IProduct> getProductList ();
}
