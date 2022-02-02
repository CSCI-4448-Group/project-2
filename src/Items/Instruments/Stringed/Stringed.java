public abstract class Stringed extends Instrument
{
    private boolean electric_;

    Stringed(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, boolean electric)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice);
        brand_ = brand;
        electric_ = electric;
    }

    public boolean get_brand() {return electric_;}

    public void set_brand(boolean newElectric) {electric_ = newElectric;}
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
    Mandolin(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String brand, boolean electric)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, brand, electric);
    }
    public String toString(){
        return "Mandolin: " + get_brand();
    }
}
