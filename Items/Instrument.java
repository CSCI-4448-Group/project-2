import java.util.Date;

public class Instrument extends Item {
    private String brand_;

    Instrument(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice);
        brand_ = brand;
    }

    public String get_brand() {return brand_};

    public void set_brand(String newBrand) {brand_ = newBrand};
}

public class Stringed extends Instrument
{
    private boolean electric_;

    Stringed(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, boolean electric)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice);
        brand_ = brand;
        electric_ = electric;
    }

    public boolean get_brand() {return electric_};

    public void set_brand(boolean newElectric) {electric_ = newElectric};
}

class Guitar extends Stringed
{
    Guitar(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, boolean electric)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand, electric);
    }
    public String toString(){
        return "Guitar: " + get_brand();
    }
}

class Bass extends Stringed
{
    Bass(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, boolean electric)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand, electric);
    }
    public String toString(){
        return "Bass: " + get_brand();
    }
}

class Mandolin extends Stringed
{
    Bass(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, boolean electric)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand, electric);
    }
    public String toString(){
        return "Mandolin: " + get_brand();
    }
}

public class Wind extends Instrument
{
    Wind(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
    }
}

class Flute extends Wind
{
    private String type_;

    Flute(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, String type)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand)
        type_ = type;
    }

    public String get_type() {return type_};

    public void set_type(String newType) {type_ = newType};

    public String toString(){
        return "Flute: " + get_brand();
    }
}

class Harmonica extends Wind
{
    private String key_;

    Harmonica(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, String key)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand)
        key_ = key;
    }

    public String get_type() {return key_};

    public void set_type(String newKey) {key_ = newKey};

    public String toString(){
        return "Harmonica: " + get_brand();
    }
}
