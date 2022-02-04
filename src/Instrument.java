public abstract class Instrument extends Item {
    private String brand_;

    Instrument(String name, double purchPrice, double listPrice, boolean isNew, int dayArriv, Condition condition, double salePrice, String brand)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice);
        brand_ = brand;
    }

    public String get_brand() {return brand_;}

    public void set_brand(String newBrand) {brand_ = newBrand;}
}

