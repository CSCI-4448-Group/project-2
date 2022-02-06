import java.util.Random;
import java.util.ArrayList;

class main_class {

    public static void begin_day(Store fnms, Clerk clerk1, Clerk clerk2)
    {
        Random rand = new Random();
        int rand_num = rand.nextInt(2);
        Clerk current_clerk = null;
        if (rand_num == 0) {
            current_clerk = clerk1; // Arguments need to be set, these are wrong
        } else {
            current_clerk = clerk2; // Arguments need to be set, these are wrong
        }
        current_clerk.arrive_at_store();
        current_clerk.check_register();
        current_clerk.do_inventory();
        current_clerk.open_store();
        current_clerk.clean_store();
        //current_clerk.leave_store();
    }

    // Possible way to handle announcements, may make it easier?

     public static void print_final_messages(Store fnms)
     {
         System.out.println("Following a 30 day simulation, the following summary of the store's activities is printed below: ");
         System.out.println();
         // Inventory print statement including items themselves and total value
         System.out.println("Inventory still in store and value: ");
         ArrayList<Item> finalInventory = fnms.get_inventory().flatten_inventory();
         for (int i = 0; i < finalInventory.size(); i++)
         {
             System.out.println(finalInventory.get(i).get_name());
         }
         String inventoryValue = Integer.toString(fnms.get_inventory().get_purch_price_sum());
         System.out.println("The total value of inventory still in the store is: " + inventoryValue);

         // Sold items print items themselves with daySold and salePrice as well as total of salePrice
         System.out.println("Sold items from the store: ");
         ArrayList<Item> finalSold = fnms.get_sold_itens();
         double soldItemSum = 0.0;
         for (int i = 0; i < finalSold.size(); i++)
         {
             System.out.println(finalSold.get(i).get_name() + " was sold on day " + Integer.toString(finalSold.get(i).get_day_sold()) + " for " + Double.toString(finalSold.get(i).get_sale_price()));
             soldItemSum += finalSold.get(i).get_sale_price();
         }
         System.out.println("The total value of items sold is: " + Double.toString(soldItemSum));

         // The final count of money in the cash register
         System.out.println("The final amount of money in the cash register is: ");
         System.out.println("$" + Double.toString(fnms.get_register().get_amount()));

         // How much money was added to the register from the GoToBank Action
         System.out.println("The amount of money added to the register form the GoToBank action was: ");
         System.out.println("$" + Double.toString(fnms.get_register().get_bank_withdrawals()));
     }

    public static void main(String[] args) {
        Store FNMS = new Store(); // Initialize store, change to proper constructor later
        Clerk Shaggy = new Clerk("Shaggy", FNMS);
        Clerk Velma = new Clerk("Vemla", FNMS);

        Calendar cal = new Calendar();

        // Main program loop

        for (int i = 0; i < 30; i ++)
        {
            begin_day(FNMS, Shaggy, Velma);
            System.out.println("===========================================");
            System.out.println("\n");
        }
        print_final_messages(FNMS);
    }
}