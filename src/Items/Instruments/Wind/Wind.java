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
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
        type_ = type;
    }

    public String get_type() {return type_;}

    public void set_type(String newType) {type_ = newType;}

    public String toString(){
        return "Flute: " + get_brand();
    }
}

class Harmonica extends Wind
{
    private String key_;

    Harmonica(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, String key)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
        key_ = key;
    }

    public String get_type() {return key_;}

    public void set_type(String newKey) {key_ = newKey;}

    public String toString(){
        return "Harmonica: " + get_brand();
    }
}
