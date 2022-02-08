public abstract class Clothing extends Item
{
    private String brand_;

    Clothing(String name, double purchPrice, double listPrice, boolean isNew, int dayArriv, Condition condition, double salePrice, String brand)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice);
        brand_ = brand;
    }

    public String get_brand() {return brand_;}

    public void set_brand(String newBrand) {brand_ = newBrand;}
}

class Hat extends Clothing
{
    private int hatSize_;

    Hat(String name, double purchPrice, double listPrice, boolean isNew, int dayArriv, Condition condition, double salePrice, String brand, int hatSize)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
        hatSize_ = hatSize;
    }

    public int get_hat_size() {return hatSize_;}

    public void set_hat_size(int newHatSize) {hatSize_ = newHatSize;}

    public String toString(){
        return "Hat: " + get_brand();
    }
}

class Bandana extends Clothing
{
    Bandana(String name, double purchPrice, double listPrice, boolean isNew, int dayArriv, Condition condition, double salePrice, String brand)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
    }
    public String toString(){
        return "Bandana: " + get_brand();
    }
}

class Shirt extends Clothing
{
    private int shirtSize_;

    Shirt(String name, double purchPrice, double listPrice, boolean isNew, int dayArriv, Condition condition, double salePrice, String brand, int shirtSize)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
        shirtSize_ = shirtSize;
    }

    public int get_shirt_size() {return shirtSize_;}

    public void set_shirt_size(int newShirtSize) {shirtSize_ = newShirtSize;}

    public String toString(){
        return "Shirt: " + get_brand();
    }
}