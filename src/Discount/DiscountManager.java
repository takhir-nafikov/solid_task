package Discount;

import java.util.ArrayList;

public class DiscountManager implements IDiscountManager {
    private ArrayList<IDiscountProduct> discountProducts = new ArrayList<>();

    @Override
    public void Add(IDiscountProduct discount) {
        discountProducts.add(discount);
    }

    @Override
    public ArrayList<IDiscountProduct> GetDiscounts() {
        return discountProducts;
    }

    @Override
    public void RemoveDiscountByIndex(int index) {
        if (index >= 0 && index < discountProducts.size())
            discountProducts.remove(index);
    }
}
