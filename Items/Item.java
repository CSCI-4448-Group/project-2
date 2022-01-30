import java.util.Date;

abstract public class Item{
    private String name_;
    private float purchasePrice_;
    private float listPrice_;
    private boolean new_;
    private Date dayArrived_;
    private char condition_; //Maybe we can use a custom data type here so we can have operators like -- and ++ for increasing or decreasing condition after damage
    private float salePrice_; //Default this value to empty? Can't initialize a sale price that hasnt happened yet
    private Date daySold_; //Default this value to current date in calander?


    public Item(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice){
        name_ = name;
        purchasePrice_=purchPrice;
        listPrice_=listPrice;
        new_ = isNew;
        dayArrived_ = dayArriv;
        condition_ = condition;
        salePrice=salePrice_;
    }
    public void set_name(String name){name_ = name;}
    public void set_purch_price(float price){purchasePrice_ = price;}
    public void set_list_price(float price){listPrice_ = price;}
    public void set_is_new(boolean isNew){new_ = isNew;}
    public void set_day_arrived(Date arrived){dayArrived_ = arrived;}
    public void set_condition(char cond){condition_ = cond;}
    public void set_sale_price(float price){salePrice_ = price;}
    public void set_day_sold(Date soldDate){daySold_ = soldDate;}

    public String get_name(){return name_;}
    public float get_purch_price(){return purchasePrice_;}
    public float get_list_price(){return listPrice_;}
    public boolean get_is_new(){return new_;}
    public Date get_day_arrived(){return dayArrived_;}
    public char get_condition(){return condition_;}
    public float get_sale_price(){return salePrice_;}
    public Date get_day_sold(){return daySold_;}
    public abstract String toString();
}