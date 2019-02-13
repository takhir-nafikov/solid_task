package Calculator;

import Discount.IDiscountProduct;
import Product.IProduct;
import Product.ProductType;

import java.util.ArrayList;
import java.util.List;

public class CalculatorProduct2 implements ICalculatorProductStrategy {

    private ArrayList<ProductType> _allowProductTypes;

    @Override
    public float GetSum(IDiscountProduct discount, List<IProduct> products) {
        ArrayList<ProductType> allowProductTypes = discount.GetAllowProductTypes();
        ArrayList<ProductType> denyProductTypes = discount.GetDenyProductTypes();
        List<IProduct> discountProducts = new ArrayList<>();
        _allowProductTypes = allowProductTypes;
        float sum = 0;
        for (IProduct product : products) {
            if (_allowProductTypes.contains(product.getType()) &&
                    !denyProductTypes.contains(product.getType()) && !product.IsCalcalate())
            {
                _allowProductTypes.remove(product.getType());
                sum += product.getPrice();
                discountProducts.add(product);
                if (_allowProductTypes.size() == 0)
                    break;
            }
        }


        if (_allowProductTypes.size() == 0)
        {
            for (IProduct product : discountProducts)
            product.setCalcalate(true);

            return sum * (1 - discount.GetDiscount() / 100);
        }
        return 0;
    }
}
