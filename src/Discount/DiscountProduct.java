package Discount;

import Product.ProductType;

import java.util.ArrayList;
import java.util.Arrays;

public class DiscountProduct implements  IDiscountProduct {
    private ArrayList<ProductType> allowProductTypes = new ArrayList<>();
    private ArrayList<ProductType> denyProductTypes = new ArrayList<>();
    private float discount;
    private DiscountProductType type;

    public void SetAllowProductTypes(ProductType pt1, ProductType pt2)
    {
        Check();
        allowProductTypes = new ArrayList<>(Arrays.asList(pt1, pt2));
        type = DiscountProductType.ProductSet2;
    }

    public void SetAllowProductTypes(ProductType pt1, ProductType pt2, ProductType pt3)
    {
        Check();
        allowProductTypes = new ArrayList<>(Arrays.asList(pt1, pt2, pt3));
        type = DiscountProductType.ProductSet3;
    }

    public void SetAllowProductTypes(ProductType pt1, ProductType pt2, ProductType pt3, ProductType pt4)
    {
        Check();
        allowProductTypes = new ArrayList<>(Arrays.asList(pt1, pt2, pt3, pt4));
        type = DiscountProductType.ProductSet4;
    }

    public void SetAllowProductTypes(ProductType pt1, ProductType pt2, ProductType pt3, ProductType pt4, ProductType pt5)
    {
        Check();
        allowProductTypes =new ArrayList<>(Arrays.asList(pt1, pt2, pt3, pt4, pt5));
        type = DiscountProductType.ProductSet5;
    }

    public void SetDenyProductType(ProductType pt1)
    {
        denyProductTypes = new ArrayList<>(Arrays.asList(pt1));
    }

    public void SetDenyProductTypes(ProductType pt1, ProductType pt2)
    {
        denyProductTypes = new ArrayList<>(Arrays.asList(pt1, pt2));
    }

    public void SetDiscountProductType(DiscountProductType type)
    {
        this.type = type;
    }

    public void SetDiscount(int discount) throws Exception
    {
        discount = Math.abs(discount);
        if (discount > 100 || discount == 0)
        {
            throw new Exception("Invalid discount value (0; 100]");
        }
        this.discount = discount;
    }

    public float GetDiscount()
    {
        return discount;
    }

    public ArrayList<ProductType> GetAllowProductTypes()
    {
        return allowProductTypes;
    }

    public ArrayList<ProductType> GetDenyProductTypes()
    {
        return denyProductTypes;
    }

    public DiscountProductType GetDiscountProductType()
    {
        return type;
    }

    private void Check()
    {
        try {
            if (allowProductTypes.size() > 0) {
                throw new Exception("ProductType is already set");
            }
        } catch (Exception e) {
        }
    }
}

