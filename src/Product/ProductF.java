package Product;

public class ProductF extends Product {
    public ProductF(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductF);
    }
}

