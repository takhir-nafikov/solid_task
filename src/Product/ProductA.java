package Product;

public class ProductA extends Product {
    public ProductA(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductA);
    }
}
