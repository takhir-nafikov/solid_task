package Product;

public class ProductI extends Product {
    public ProductI(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductI);
    }
}

