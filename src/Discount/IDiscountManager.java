package Discount;

import java.util.ArrayList;

public interface IDiscountManager {
    void Add(IDiscountProduct discount);
    ArrayList<IDiscountProduct> GetDiscounts();
    void RemoveDiscountByIndex(int index);
}
