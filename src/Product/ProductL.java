package Product;

public class ProductL extends Product {
    public ProductL(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductL);
    }
}

