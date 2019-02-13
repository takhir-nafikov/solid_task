package Product;

public class ProductC extends Product {
    public ProductC(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductC);
    }
}
