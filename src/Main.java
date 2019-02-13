import Calculator.CalculatorManager;
import Cart.Cart;
import Discount.DiscountManager;
import Discount.DiscountProduct;
import Discount.DiscountProductType;
import Product.Product;
import Product.ProductType;

public class Main {

    public static void main(String args[]) throws Exception {

        Product productA = Product.CreateProduct(ProductType.ProductA, 200, "A");
        Product productB = Product.CreateProduct(ProductType.ProductB, 100, "B");
        Product productC = Product.CreateProduct(ProductType.ProductC, 300, "C");
        Product productD = Product.CreateProduct(ProductType.ProductD, 400, "D");
        Product productE = Product.CreateProduct(ProductType.ProductE, 500, "E");
        Product productC1 = Product.CreateProduct(ProductType.ProductC, 50, "C1");
        Product productA1 = Product.CreateProduct(ProductType.ProductA, 50, "A1");

        DiscountProduct discount1 = new DiscountProduct();
        discount1.SetAllowProductTypes(ProductType.ProductA, ProductType.ProductB);
        discount1.SetDiscount(10);

        DiscountProduct discount2 = new DiscountProduct();
        discount2.SetAllowProductTypes(ProductType.ProductA, ProductType.ProductK);
        discount2.SetDiscount(5);

        DiscountProduct discount3 = new DiscountProduct();
        discount3.SetAllowProductTypes(ProductType.ProductA, ProductType.ProductL);
        discount3.SetDiscount(5);

        DiscountProduct discount4 = new DiscountProduct();
        discount4.SetAllowProductTypes(ProductType.ProductA, ProductType.ProductM);
        discount4.SetDiscount(5);

        DiscountProduct discount5 = new DiscountProduct();
        discount5.SetAllowProductTypes(ProductType.ProductD, ProductType.ProductE);
        discount5.SetDiscount(5);

        DiscountProduct discount6 = new DiscountProduct();
        discount6.SetAllowProductTypes(ProductType.ProductE, ProductType.ProductF, ProductType.ProductG);
        discount6.SetDiscount(5);

        DiscountProduct discount7 = new DiscountProduct();
        discount7.SetDenyProductTypes(ProductType.ProductA, ProductType.ProductC);
        discount7.SetDiscountProductType(DiscountProductType.ProductSet3);
        discount7.SetDiscount(5);

        DiscountProduct discount8 = new DiscountProduct();
        discount8.SetDenyProductTypes(ProductType.ProductA, ProductType.ProductC);
        discount8.SetDiscountProductType(DiscountProductType.ProductSet4);
        discount8.SetDiscount(5);

        DiscountProduct discount9 = new DiscountProduct();
        discount9.SetDenyProductTypes(ProductType.ProductA, ProductType.ProductC);
        discount9.SetDiscountProductType(DiscountProductType.ProductSet5);
        discount9.SetDiscount(5);

        Cart cart = new Cart();
        cart.AddProduct(productA);
        cart.AddProduct(productB);
        cart.AddProduct(productC);
        cart.AddProduct(productD);
        cart.AddProduct(productE);
        cart.AddProduct(productC1);
        cart.AddProduct(productA1);

        DiscountManager discountManager = new DiscountManager();
        discountManager.Add(discount1);
        discountManager.Add(discount2);
        discountManager.Add(discount3);
        discountManager.Add(discount4);
        discountManager.Add(discount5);
        discountManager.Add(discount6);
        discountManager.Add(discount7);
        discountManager.Add(discount8);
        discountManager.Add(discount9);

        CalculatorManager calculatorManager = new CalculatorManager();
        calculatorManager.SetDiscountManager(discountManager);
        calculatorManager.SetCart(cart);

        System.out.println("result: " + calculatorManager.Calculate());

    }
}
