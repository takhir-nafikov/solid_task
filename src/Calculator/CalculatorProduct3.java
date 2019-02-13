package Calculator;

import Discount.IDiscountProduct;
import Product.IProduct;
import Product.ProductType;

import java.util.ArrayList;
import java.util.List;

public class CalculatorProduct3  implements  ICalculatorProductStrategy{
    private static int COUNT = 3;

    @Override
    public float GetSum(IDiscountProduct discount, List<IProduct> products) {
        ArrayList<ProductType> allowProductTypes = discount.GetAllowProductTypes();
        ArrayList<ProductType> denyProductTypes = discount.GetDenyProductTypes();
        float sum = 0;
        List<IProduct> discountProducts = new ArrayList<>();

        for (IProduct product : products)
        {
            if (!denyProductTypes.contains(product.getType()) && !product.IsCalcalate())
            {
                sum += product.getPrice();
                discountProducts.add(product);
            }
        }
        if (discountProducts.size() == COUNT)
        {
            for (IProduct product : discountProducts)
            product.setCalcalate(true);

            return sum * (1 - discount.GetDiscount() / 100);
        }
        return 0;
    }
}
