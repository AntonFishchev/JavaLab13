package lab13;

public class ProductImpl implements IProduct {
    private Integer id;
    private String title;
    private Integer cost;

    public ProductImpl(Integer id, String title, Integer cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return title + " - " + cost ;
    }
}
