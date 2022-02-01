import java.util.Date;

public class Players extends Item {
    private String brand_;

    Players(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice);
        brand_ = brand;
    }

    public String get_brand() {return brand_};

    public void set_brand(String newBrand) {brand_ = newBrand};
}

class RecordPlayer extends Players
{
    CD_Player(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
    }
    public String toString(){
        return "RecordPlayer: " + get_brand();
    }
}

class MP3 extends Players
{
    CD_Player(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand);
    }
    public String toString(){
        return "MP3: " + get_brand();
    }
}