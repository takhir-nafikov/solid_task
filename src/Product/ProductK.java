package Product;

public class ProductK extends Product {
    public ProductK(float price, int id, String name) {
        setPrice(Math.abs(price));
        setId(id);
        setName(name);
        setProductType(ProductType.ProductK);
    }
}

