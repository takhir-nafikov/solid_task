package Product;

public class ProductB extends Product {
    public ProductB(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductB);
    }
}
