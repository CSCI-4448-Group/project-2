import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintStream;

class main_class {

    public static void begin_day(Store fnms, Clerk clerk1, Clerk clerk2)
    {
        // Choose a random number (either 0 or 1) and assign the respective clerk to work for that day.
        Random rand = new Random();
        int rand_num = rand.nextInt(2);

        Clerk current_clerk = new Clerk("", fnms);
        if (rand_num == 0) {
            current_clerk = clerk1; // Arguments need to be set, these are wrong
        } else {
            current_clerk = clerk2; // Arguments need to be set, these are wrong
        }
        // Clerk arrives at store
        current_clerk.arrive_at_store();

        // Clerk checks the register, goes to bank as necessary
        current_clerk.check_register();

        // Clerk checks inventory, places orders for new items if none are present in the store
        current_clerk.do_inventory();

        // Clerk opens the store, handles all customer interactions
        current_clerk.open_store();

        // Clerk cleans the store, possibly damages items in the process
        current_clerk.clean_store();

        // Clerk announces he leaves the store
        //current_clerk.leave_store();
    }

    // Possible way to handle announcements, may make it easier?

     public static void print_final_messages(Store fnms)
     {
         System.out.println("Following a 30 day simulation, the following summary of the store's activities is printed below: ");
         System.out.println();

         // Inventory print statement including items themselves and total value
         // Calls flatten inventory, which returns an ArrayList of all items still in inventory
         // get_inventory returns an inventory object, and we then flatten the object to get the ArrayList.
         System.out.println("Inventory still in store and value: ");
         ArrayList<Item> finalInventory = fnms.get_inventory().flatten_inventory();
         for (int i = 0; i < finalInventory.size(); i++)
         {
             // Prints the name of each item in inventory.
             System.out.println(finalInventory.get(i).get_name());
         }

         // get_purchase_price_sum gets the sum of all item values in inventory.
         String inventoryValue = Integer.toString(fnms.get_inventory().get_purch_price_sum());
         System.out.println("The total value of inventory still in the store is: " + inventoryValue);

         // Sold items print items themselves with daySold and salePrice as well as total of salePrice
         // get_sold_items returns an arrayList of items sold
         System.out.println("Sold items from the store: ");
         ArrayList<Item> finalSold = fnms.get_sold_itens();

         // Declare a tracker which maintains the total count of our sold item prices.
         double soldItemSum = 0.0;
         for (int i = 0; i < finalSold.size(); i++)
         {
             // get_day_sold returns the day as an integer which the particular item was sold
             // get_sale_price returns the sale price of the item
             System.out.println(finalSold.get(i).get_name() + " was sold on day " + Integer.toString(finalSold.get(i).get_day_sold()) + " for " + Double.toString(finalSold.get(i).get_sale_price()));
             soldItemSum += finalSold.get(i).get_sale_price();
         }
         System.out.println("The total value of items sold is: " + Double.toString(soldItemSum));

         // The final count of money in the cash register
         // get_register returns a register object, get_ammount returns the amount as a double that's currently in the register
         System.out.println("The final amount of money in the cash register is: ");
         System.out.println("$" + Double.toString(fnms.get_register().get_amount()));

         // How much money was added to the register from the GoToBank Action
         // get_bank_withdrawals returns the total amount as a double that was taken out of the bank.
         System.out.println("The amount of money added to the register form the GoToBank action was: ");
         System.out.println("$" + Double.toString(fnms.get_register().get_bank_withdrawals()));
     }

    public static void main(String[] args) {
        // Initialize store and two clerk objects
        Store FNMS = new Store(); 
        Clerk Shaggy = new Clerk("Shaggy", FNMS);
        Clerk Velma = new Clerk("Vemla", FNMS);

        // Main program loop
        // Run loop for 30 days, calling begin_day each time, and print out a delineator between each day.
        for (int i = 0; i < 30; i ++)
        {
            begin_day(FNMS, Shaggy, Velma);
            System.out.println("===========================================");
            System.out.println("\n");
        }

        // Prints the summary / final messages
        print_final_messages(FNMS);
    }
}