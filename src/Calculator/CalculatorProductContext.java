package Calculator;

import Discount.IDiscountProduct;
import Product.IProduct;

import java.util.List;

public class CalculatorProductContext {
    private ICalculatorProductStrategy strategy;

    public CalculatorProductContext(ICalculatorProductStrategy strategy) {
        this.strategy = strategy;
    }

    public float GetSum(IDiscountProduct discount, List<IProduct> products) {
        return strategy.GetSum(discount, products);
    }
}
