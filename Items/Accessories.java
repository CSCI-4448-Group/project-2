import java.util.Date;

public class Accessories extends Item
{
    private String brand_;

    Accessories(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice);
        brand_ = brand;
    }

    public String get_brand() {return brand_};

    public void set_brand(String newBrand) {brand_ = newBrand};
}

class PracticeAmps extends Accessories
{
    private int wattage_;

    PracticeAmps(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, int wattage)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
        wattage_ = wattage;
    }

    public int get_wattage() {return wattage_};

    public void set_wattage(int newWattage) {wattage_ = newWattage};

    public String toString(){
        return "Practice Amp: " + get_brand();
    }
}

class Cables extends Accessories
{
    private int length_;

    Cables(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, int length)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
        length_ = length;
    }

    public int get_length() {return length_};

    public void set_length(int newLength) {length_ = newLength};

    public String toString(){
        return "Cable: " + get_brand();
    }
}

class Strings extends Accessories
{
    private String type_;

    Strings(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, int type)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
        type_ = type;
    }

    public String get_type() {return type_};

    public void set_type(String newType) {type_ = newType};

    public String toString(){
        return "Strings: " + get_brand();
    }
}