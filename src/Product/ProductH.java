package Product;

public class ProductH extends Product {
    public ProductH(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductH);
    }
}

