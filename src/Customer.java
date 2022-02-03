public class Customer extends Person {

    private boolean selling_;
    private Item item_;

    public Customer(String name, boolean selling, Item item) {
        super(name);
        selling_ = selling;
        item_ = item;
    }

    public Item get_item() {return item_;}
    public boolean get_selling() {return selling_;}
    
}
