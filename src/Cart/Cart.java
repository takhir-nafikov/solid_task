package Cart;

import Product.IProduct;

import java.util.ArrayList;

public class Cart implements ICart {
    private ArrayList<IProduct> products = new ArrayList<>();

    @Override
    public void AddProduct(IProduct product) {
        products.add(product);
    }

    @Override
    public ArrayList<IProduct> GetProducts() {
        return products;
    }

    @Override
    public void RemoveProductByIndex(int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        }
    }
}
