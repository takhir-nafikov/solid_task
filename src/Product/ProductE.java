package Product;

public class ProductE extends Product {
    public ProductE(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductE);
    }
}
