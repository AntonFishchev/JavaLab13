package lab13;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component("productService")
public class ProductService {
    private List<IProduct> productList = new ArrayList<>();

    public void printAll() {
        productList.stream().forEach(System.out::println);
    }

    public IProduct findByTitle(String title) {
        for (IProduct product : productList) {
            if (product.getTitle().equals(title)) {
                return product;
            }
        }
        return null;
    }

    @PostConstruct
    public void init() {
        productList.add(new ProductImpl(1,  "Молоко",    40 ));
        productList.add(new ProductImpl(2,  "Сыр",       100));
        productList.add(new ProductImpl(3,  "Хлеб",      20 ));
        productList.add(new ProductImpl(4,  "Сахар",     35 ));
        productList.add(new ProductImpl(5,  "Соль",      27 ));
        productList.add(new ProductImpl(6,  "Пельмени",  160));
        productList.add(new ProductImpl(7,  "Курица",    140));
        productList.add(new ProductImpl(8,  "Тушенка",   110));
        productList.add(new ProductImpl(9,  "Шоколадка", 50 ));
        productList.add(new ProductImpl(10, "Яица",      50 ));
    }
}
