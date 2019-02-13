package Calculator;

import Cart.ICart;
import Discount.IDiscountManager;
import Discount.IDiscountProduct;
import Product.IProduct;

import java.util.ArrayList;

public class CalculatorManager implements ICalculatorManager {

    private IDiscountManager discountManager;
    private ICart cart;
    private float sum;

    @Override
    public void SetCart(ICart cart) {
        this.cart = cart;
    }

    @Override
    public void SetDiscountManager(IDiscountManager discountManager) {
        this.discountManager = discountManager;
    }

    @Override
    public float Calculate() {
        if (discountManager == null || cart == null) {
            return -1;
        }

        if (discountManager.GetDiscounts().size() > 0)
        {
            ArrayList<IProduct> products = cart.GetProducts();
            for (IDiscountProduct discount : discountManager.GetDiscounts())
            {

                switch (discount.GetDiscountProductType())
                {
                    case ProductSet2:
                        CalculatorProductContext calculatorProduct2Context = new CalculatorProductContext(new CalculatorProduct2());
                        sum += calculatorProduct2Context.GetSum(discount, products);
                        break;
                    case ProductSet3:
                        CalculatorProductContext calculatorProduct3Context = new CalculatorProductContext(new CalculatorProduct3());
                        sum += calculatorProduct3Context.GetSum(discount, products);
                        break;
                    case ProductSet4:
                        CalculatorProductContext calculatorProduct4Context = new CalculatorProductContext(new CalculatorProduct4());
                        sum += calculatorProduct4Context.GetSum(discount, products);
                        break;
                    case ProductSet5:
                        CalculatorProductContext calculatorProduct5Context = new CalculatorProductContext(new CalculatorProduct5());
                        sum += calculatorProduct5Context.GetSum(discount, products);
                        break;
                }
            }
        }

        for (IProduct product : cart.GetProducts())
        {
            if (!product.IsCalcalate())
            {
                sum += product.getPrice();
                product.setCalcalate(true);
            }
        }
        return sum;
    }
}
