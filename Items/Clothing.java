import java.util.Date;

public class Clothing extends Item
{
    private String brand_;

    Clothing(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice);
        brand_ = brand;
    }

    public String get_brand() {return brand_};

    public void set_brand(String newBrand) {brand_ = newBrand};
}

class Hats extends Clothing
{
    private int hatSize_;

    Hats(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, int hatSize)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
        hatSize_ = hatSize;
    }
    public String toString(){
        return "Hat: " + get_brand();
    }
}

class Bandanas extends Clothing
{
    Bandanas(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
    }
    public String toString(){
        return "Bandanas: " + get_brand();
    }
}

class Shirts extends Clothing
{
    private int shirtSize_;

    Shirts(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, int shirtSize)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
        shirtSize_ = shirtSize;
    }
    public String toString(){
        return "Shirt: " + get_brand();
    }
}