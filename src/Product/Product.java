package Product;


public class Product implements IProduct {

    private static int currentId = -1;
    protected float price;
    protected String name;
    protected ProductType type;
    protected int id;
    protected boolean isCalculate;


    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ProductType getType() {
        return type;
    }

    @Override
    public void setProductType(ProductType type) {
        this.type = type;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setCalcalate(boolean flag) {
        isCalculate = flag;
    }

    @Override
    public boolean IsCalcalate() {
        return isCalculate;
    }

    public static Product CreateProduct(ProductType type, float price, String name) throws Exception {
        Product p;
        currentId++;
        switch (type)
        {
            case ProductA:
                p = new ProductA(price, currentId, name);
                break;
            case ProductB:
                p = new ProductB(price, currentId, name);
                break;
            case ProductC:
                p = new ProductC(price, currentId, name);
                break;
            case ProductD:
                p = new ProductD(price, currentId, name);
                break;
            case ProductE:
                p = new ProductE(price, currentId, name);
                break;
            case ProductF:
                p = new ProductF(price, currentId, name);
                break;
            case ProductG:
                p = new ProductG(price, currentId, name);
                break;
            case ProductH:
                p = new ProductH(price, currentId, name);
                break;
            case ProductI:
                p = new ProductI(price, currentId, name);
                break;
            case ProductJ:
                p = new ProductJ(price, currentId, name);
                break;
            case ProductK:
                p = new ProductK(price, currentId, name);
                break;
            case ProductL:
                p = new ProductL(price, currentId, name);
                break;
            case ProductM:
                p = new ProductM(price, currentId, name);
                break;
            default:
                throw new Exception("Error create Product");
        }
        return p;
    }
}
