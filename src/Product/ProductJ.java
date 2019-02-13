package Product;

public class ProductJ extends Product {
    public ProductJ(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductJ);
    }
}

