package Product;

public class ProductM extends Product {
    public ProductM(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductM);
    }
}

