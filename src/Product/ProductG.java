package Product;

public class ProductG extends Product {
    public ProductG(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductG);
    }
}

