package Product;

public interface IProduct {
    int getId();
    void setId(int id);

    void setCalcalate(boolean flag);
    boolean IsCalcalate();

    String getName();
    void setName(String name);

    float getPrice();
    void setPrice(float price);

    ProductType getType();
    void setProductType(ProductType type);
}
