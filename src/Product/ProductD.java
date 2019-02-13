package Product;

public class ProductD extends Product {
    public ProductD(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductD);
    }
}
