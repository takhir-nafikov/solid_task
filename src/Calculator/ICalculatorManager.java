package Calculator;

import Cart.ICart;
import Discount.IDiscountManager;

public interface ICalculatorManager {
    float Calculate();
    void SetCart(ICart cart);
    void SetDiscountManager(IDiscountManager discountManager);
}
