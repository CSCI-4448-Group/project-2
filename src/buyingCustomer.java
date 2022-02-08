import java.util.Random;
import java.util.ArrayList;
public class buyingCustomer extends Person {

    private String wantedType_;

     public buyingCustomer(String name) {
         super(name);
         initializeBuyingCustomer();
     }

     public void initializeBuyingCustomer() {
         //Get a list of item types
         ArrayList<String> item_types = Inventory.get_item_types();
         Random rand = new Random();

         // Gets a random type of item from list
         wantedType_ = item_types.get(rand.nextInt(item_types.size()));
     }

     //Returns the type of item the customer wants to buy
     public String get_wanted_type(){
         return wantedType_;
     }
 }