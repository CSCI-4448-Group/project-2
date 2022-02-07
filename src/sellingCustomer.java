import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class sellingCustomer extends Person {
    // private Set<String> Item_types;
    

    // Initialize Selling Customer
    public sellingCustomer (String name, Item item) throws Exception {
        super(name);
        initializeSellingCustomer();
    }

    public void initializeSellingCustomer () throws Exception {
        // Get a list of strings of the types of items
        ArrayList<String> item_types = Inventory.get_item_types();
        Random rand = new Random();

        // Gets a random type of item from list
        String type = item_types.get(rand.nextInt(item_types.size()));

        // Generates a random item of the type
        Item selling_item = Item.generate_item(type);



    }



    // public Item get_item() {return item_;}
}
