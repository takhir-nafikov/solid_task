package Cart;

import Product.IProduct;

import java.util.ArrayList;

public interface ICart {
    void AddProduct(IProduct product);
    ArrayList<IProduct> GetProducts();
    void RemoveProductByIndex(int index);
}
