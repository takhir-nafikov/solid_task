package Calculator;

import Discount.IDiscountProduct;
import Product.IProduct;

import java.util.List;

public interface ICalculatorProductStrategy {
    float GetSum(IDiscountProduct discount, List<IProduct> products);
}
