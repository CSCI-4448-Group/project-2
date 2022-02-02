abstract public class Item{
    private String name_;
    private double purchasePrice_;
    private double listPrice_;
    private boolean new_;
    private int dayArrived_;
    private char condition_; //Maybe we can use a custom data type here so we can have operators like -- and ++ for increasing or decreasing condition after damage
    private double salePrice_; //Default this value to empty? Can't initialize a sale price that hasnt happened yet
    private int daySold_; //Default this value to current int in calander?


    public Item(String name, double purchPrice, double listPrice, boolean isNew, int dayArriv, char condition, double salePrice){
        name_ = name;
        purchasePrice_=purchPrice;
        listPrice_=listPrice;
        new_ = isNew;
        dayArrived_ = dayArriv;
        condition_ = condition;
        salePrice=salePrice_;
    }
    public void set_name(String name){name_ = name;}
    public void set_purch_price(double price){purchasePrice_ = price;}
    public void set_list_price(double price){listPrice_ = price;}
    public void set_is_new(boolean isNew){new_ = isNew;}
    public void set_day_arrived(int arrived){dayArrived_ = arrived;}
    public void set_condition(char cond){condition_ = cond;}
    public void set_sale_price(double price){salePrice_ = price;}
    public void set_day_sold(int soldint){daySold_ = soldint;}

    public String get_name(){return name_;}
    public double get_purch_price(){return purchasePrice_;}
    public double get_list_price(){return listPrice_;}
    public boolean get_is_new(){return new_;}
    public int get_day_arrived(){return dayArrived_;}
    public char get_condition(){return condition_;}
    public double get_sale_price(){return salePrice_;}
    public int get_day_sold(){return daySold_;}
    public abstract String toString();
}